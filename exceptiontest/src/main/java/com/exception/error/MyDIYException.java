package com.exception.error;

import com.exception.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyDIYException {

    @ExceptionHandler(Exception.class)
    public ModelAndView myException(Exception e){
        ModelAndView  modelAndView=new ModelAndView();
        modelAndView.setViewName("error2");
        if (e instanceof MyException)
            modelAndView.addObject("message",e.getMessage());
        else
            modelAndView.addObject("message","系统异常");

        return modelAndView;
    }
}
