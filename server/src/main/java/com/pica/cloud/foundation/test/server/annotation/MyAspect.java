// Copyright 2016-2101 Pica.
package com.pica.cloud.foundation.test.server.annotation;

import com.alibaba.fastjson.JSON;
import javassist.*;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.MethodInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyAspect
 * @Description TODO
 * @Author karl Kang
 * @Date 2019/5/7 15:43
 * @ModifyDate 2019/5/7 15:43
 * @Version 1.0
 */
@Aspect
@Component
public class MyAspect {
    @Pointcut("@annotation(MyAnnotation)")
    public void annotationPointcut() {
    }

    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) throws Exception {

        String classType = joinPoint.getTarget().getClass().getName();
        Class<?> clazz = Class.forName(classType);
        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println("============参数值");
        Object[] paramValues = joinPoint.getArgs();
        /*for (Object paramValue : paramValues) {
            System.out.println("paramValue : " + JSON.toJSONString(paramValue));
        }*/
        Map<String, String> paramMap = new HashMap<>();
        String methodName = methodSignature.getName();
        System.out.println("============参数名称");
        String[] parameterNames = methodSignature.getParameterNames();
        for (int i = 0; i < parameterNames.length; i++) {
            System.out.println(parameterNames[i] + " : " + JSON.toJSONString(paramValues[i]));
            paramMap.put(parameterNames[i], JSON.toJSONString(paramValues[i]));
        }

        String token = paramMap.get("token");
        if (!"666".equals(token)) {
            throw new Exception("请登录");
        }



       /* Class<? extends MyAspect> aClass = this.getClass();
        Map<String, Object> fieldsName = getFieldsName(aClass, classType, methodName, paramValues);
        System.out.println("fieldsName : " + JSON.toJSONString(fieldsName));*/

        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        String value = annotation.value();
        System.out.println("准备"+value);
    }

    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) throws ClassNotFoundException, NotFoundException {

        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        String value = annotation.value();
        System.out.println("结束"+value);
    }

    private Map<String,Object> getFieldsName(Class cls, String clazzName, String methodName, Object[] args) throws NotFoundException {
        Map<String,Object > map=new HashMap<String,Object>();

        ClassPool pool = ClassPool.getDefault();
        //ClassClassPath classPath = new ClassClassPath(this.getClass());
        ClassClassPath classPath = new ClassClassPath(cls);
        pool.insertClassPath(classPath);

        CtClass cc = pool.get(clazzName);
        CtMethod cm = cc.getDeclaredMethod(methodName);
        MethodInfo methodInfo = cm.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
        if (attr == null) {
            // exception
        }
        // String[] paramNames = new String[cm.getParameterTypes().length];
        int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
        for (int i = 0; i < cm.getParameterTypes().length; i++){
            map.put( attr.variableName(i + pos),args[i]);//paramNames即参数名
        }

        //Map<>
        return map;
    }


}
