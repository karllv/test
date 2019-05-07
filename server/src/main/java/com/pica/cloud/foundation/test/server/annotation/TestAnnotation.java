// Copyright 2016-2101 Pica.
package com.pica.cloud.foundation.test.server.annotation;

import com.pica.cloud.foundation.entity.PicaResponse;
import javafx.util.Builder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestAnnotation
 * @Description TODO
 * @Author karl Kang
 * @Date 2019/5/7 15:46
 * @ModifyDate 2019/5/7 15:46
 * @Version 1.0
 */
@RestController
public class TestAnnotation {
    @MyAnnotation("吃饭")
    @RequestMapping(value = "/say/{id}/{id2}", method = RequestMethod.GET)
    public String sayHello(@RequestHeader("token") String token, @PathVariable("id") Integer id, @RequestParam("name") String name,
                           @PathVariable("id2") Integer id2, @RequestParam("name2") String name2) {
        System.out.println("入参：id:" + id + "，name:" + name);
        return "你好";
    }
}
