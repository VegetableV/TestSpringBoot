package com.exception.error;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@Component
public class MyDIYError implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request,
                                         HttpStatus status,
                                         Map<String, Object> model) {
        if (status.equals(HttpStatus.NOT_FOUND)) {
            System.out.println("DIY");
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/404");
            modelAndView.setStatus(HttpStatus.NOT_FOUND);
            return modelAndView;
        }
        return null;
    }
}
