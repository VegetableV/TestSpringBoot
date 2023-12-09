package com.exception.error;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class MyCustomizer{
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> myError(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>(){
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                System.out.println(123);
                ErrorPage errorPage=new ErrorPage(HttpStatus.NOT_FOUND,"/404");
                factory.addErrorPages(errorPage);
            }
        };
    }
}
