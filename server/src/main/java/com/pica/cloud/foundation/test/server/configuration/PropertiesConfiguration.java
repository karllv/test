package com.pica.cloud.foundation.test.server.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class PropertiesConfiguration {
    @Value("${app.foundation.token.user.expire}")
    private String userExpire;

    @Value("${app.foundation.token.guest.expire}")
    private String guestExpire;

    public String getUserExpire() {
        return userExpire;
    }

    public void setUserExpire(String userExpire) {
        this.userExpire = userExpire;
    }

    public String getGuestExpire() {
        return guestExpire;
    }

    public void setGuestExpire(String guestExpire) {
        this.guestExpire = guestExpire;
    }

    @Override
    public String toString() {
        return "PropertiesConfiguration{" +
                "userExpire='" + userExpire + '\'' +
                ", guestExpire='" + guestExpire + '\'' +
                '}';
    }
}
