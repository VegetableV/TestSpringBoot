package com.filterandinterceptor.filter;

import javax.servlet.annotation.WebFilter;

import javax.servlet.*;
import java.io.IOException;

@WebFilter(filterName = "customerFilter2",urlPatterns = {"/*"})
public class CustomerFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("---------------filter2 init---------");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("---------------filter2 doFilter---------");
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("---------------filter2 destroy---------");

        Filter.super.destroy();
    }
}
