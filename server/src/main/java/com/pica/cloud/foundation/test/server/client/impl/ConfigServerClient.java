package com.pica.cloud.foundation.test.server.client.impl;

import org.springframework.stereotype.Component;
import com.pica.cloud.foundation.test.server.client.IConfigServiceClient;

@Component
public class ConfigServerClient implements IConfigServiceClient {
    @Override
    public String beans() {
       return "Get bean failed!";
    }
}
