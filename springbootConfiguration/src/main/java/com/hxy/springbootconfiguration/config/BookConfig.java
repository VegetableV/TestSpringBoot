package com.hxy.springbootconfiguration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="book")
@Data
public class BookConfig {
    private String name;
    private Double price;
    private String[] type;

}
