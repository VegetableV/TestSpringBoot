package com.exception.controller;

import com.exception.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {
    @RequestMapping("/404")
    public String error(){
        return "error";
    }

    @RequestMapping("/globeException")
    public String error2() throws Exception{
        throw new MyException("全局异常");
    }
}
