package com.hxy.springbootconfiguration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:vegetable.properties")
public class VegetableConfig {
    private String potato;
    private String eggplant;
    private String green;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public VegetableConfig(String potato, String eggplant, String green) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.green = green;
    }

    public VegetableConfig() {
    }
}
