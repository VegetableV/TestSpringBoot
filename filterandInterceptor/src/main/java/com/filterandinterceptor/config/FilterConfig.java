package com.filterandinterceptor.config;

import com.filterandinterceptor.filter.CustomerFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomerFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<CustomerFilter> filterFilterRegistrationBean=new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomerFilter());
        ArrayList<String> urls = new ArrayList<>();
        filterFilterRegistrationBean.setUrlPatterns(urls);
        return filterFilterRegistrationBean;

    }
}
