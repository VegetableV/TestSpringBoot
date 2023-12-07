package com.filterandinterceptor.config;

import com.filterandinterceptor.interceptor.CustomerInterceptor;
import com.filterandinterceptor.interceptor.CustomerInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class InterceptionConfig implements WebMvcConfigurer {
    @Autowired
    private CustomerInterceptor customerInterceptor;
    @Autowired
    private CustomerInterceptor2 customerInterceptor2;
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customerInterceptor).addPathPatterns("/**");
        registry.addInterceptor(customerInterceptor2).addPathPatterns("/**");

    }

}
