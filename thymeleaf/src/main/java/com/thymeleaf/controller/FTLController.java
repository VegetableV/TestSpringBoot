package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class FTLController {

    @RequestMapping("ftl")
    public String returnView(Model model){
        System.out.println(3123);
        model.addAttribute("now",new Date().toString());
        return "index";
    }
}
