package com.mybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource getDB1(){
        return DataSourceBuilder.create().build();
    }
    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource getDB2(){
        return DataSourceBuilder.create().build();
    }
}
