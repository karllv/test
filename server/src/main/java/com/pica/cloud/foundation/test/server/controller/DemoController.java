package com.pica.cloud.foundation.test.server.controller;

/*import com.pica.cloud.foundation.entity.PicaResponse;
import com.pica.cloud.foundation.redis.IRedisClient;
import com.pica.cloud.foundation.test.server.client.IConfigServiceClient;
import com.pica.cloud.foundation.test.server.configuration.PropertiesConfiguration;
import com.pica.cloud.foundation.test.server.entity.Hospital;
import com.pica.cloud.foundation.test.server.mapper.HospitalMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(value = "冒烟测试", description = "测试 db，redis，读取自定义配置 以及使用 feign 调用微服务")
public class DemoController {
    @Autowired
    private HospitalMapper personMapper;

    *//*@Autowired
    private IRedisClient redisClient;*//*

    @Autowired
    private PropertiesConfiguration properties;

    @Autowired
    private LoadBalancerClient slb;

    @Autowired
    private IConfigServiceClient client;

    @ApiOperation(value = "DB连接测试：更新Person对象", response = PicaResponse.class)
    @RequestMapping(value = "/db", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public PicaResponse<Hospital> saveToDB() {
        // 创建一个ResponseBuilder
        PicaResponse.Builder<Hospital> builder = new PicaResponse.Builder<>();

        builder.setData(personMapper.selectByPrimaryKey(1008));

        // 返回Response
        return builder.build();
    }

    *//*@ApiOperation(value = "Redis连接测试：插入一个Person对象到Redis", response = PicaResponse.class)
    @RequestMapping(value = "/redis", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public PicaResponse<String> saveToCache() {
        PicaResponse.Builder<String> builder = new PicaResponse.Builder<>();

        redisClient.set("keyname", personMapper.selectByPrimaryKey(1008));

        return builder.setData(redisClient.get("keyname")).build();
    }*//*

    @ApiOperation(value = "读取配置测试", response = PicaResponse.class)
    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public PicaResponse<String> readFromConfiguration() {
        PicaResponse.Builder<String> builder = new PicaResponse.Builder<>();

        builder.setData(properties.toString());

        return builder.build();
    }

    @ApiOperation(value = "Feign调用微服务", response = PicaResponse.class)
    @RequestMapping(value = "/beans", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String beans() {
        return client.beans();
    }
}*/
