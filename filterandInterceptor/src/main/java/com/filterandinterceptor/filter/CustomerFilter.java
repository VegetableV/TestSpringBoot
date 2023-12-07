package com.filterandinterceptor.filter;


import javax.servlet.*;
import java.io.IOException;

public class CustomerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------filter init-----------");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("----------filter doFilter-----------");
        filterChain.doFilter(servletRequest,servletResponse);


    }

    @Override
    public void destroy() {
        System.out.println("-------------filter destroy-------");
        Filter.super.destroy();
    }
}
