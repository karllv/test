package com.pica.cloud.foundation.test.server.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CONFIG-SERVER: 服务名称
 *      服务名称可以从eureka(http://192.168.110.120:7891/)上获得
 */
@FeignClient(value="CONFIG-SERVER")
public interface IConfigServiceClient {

    /**
     * 被调用服务的签名
     *
     * 注意,定义此接口时,@RequestParam("xxx")和@ReqeustHead("xxx")必须写value,
     * 不同于springmvc自动根据参数名作为默认值,feign必须指定这个参数对应哪个服务提供端的参数
     */
    @RequestMapping(value = "/beans", method = RequestMethod.GET)
    String beans();
}
