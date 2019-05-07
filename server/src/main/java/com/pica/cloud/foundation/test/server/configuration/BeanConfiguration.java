package com.pica.cloud.foundation.test.server.configuration;

import com.pica.cloud.foundation.redis.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Configuration
@RefreshScope
public class BeanConfiguration {
   /* @Value("${spring.redis.cluster.nodes}")
    private String[] nodes;

    @Value("${spring.redis.mode}")
    private String mode;

    @Bean
    public IRedisClient redisClient() {
        return new RedisClient(mode, nodes);
    }*/
}
