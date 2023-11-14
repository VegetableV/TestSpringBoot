package com.hxy.springbootconfiguration;

import com.hxy.springbootconfiguration.config.BookConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BookConfig.class)
public class SpringbootConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigurationApplication.class, args);
    }

}
