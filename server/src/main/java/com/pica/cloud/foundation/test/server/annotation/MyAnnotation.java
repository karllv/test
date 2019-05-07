// Copyright 2016-2101 Pica.
package com.pica.cloud.foundation.test.server.annotation;

import java.lang.annotation.*;

/**
 * @ClassName MyAnnotation
 * @Description TODO
 * @Author karl Kang
 * @Date 2019/5/7 15:11
 * @ModifyDate 2019/5/7 15:11
 * @Version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
    String value() default "";
}
