package com.thymeleaf.controller;

import com.thymeleaf.bean.Spy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","<h1>thymeleaf</h1>");
        Spy spy=new Spy();
        spy.setFather("黄昏");
        spy.setMother("约尔");
        spy.setKid("阿尼亚");
        model.addAttribute("spy",spy);
        return "thymeleaf/index";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "thymeleaf/welcome";
    }
}
