package com.hxy.springbootconfiguration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "egg")
@PropertySource("classpath:egg.properties")
public class EggConfig {
    private String egg;
    private String rice;

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public EggConfig(String egg, String rice) {
        this.egg = egg;
        this.rice = rice;
    }

    public EggConfig() {
    }
}
