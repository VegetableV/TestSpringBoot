package com.jpa.controller;


import com.jpa.entity.Guset;
import com.jpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller()
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Guset> guests = guestService.list();
        model.addAttribute("guestList",guests);
        return "list";
    }


}
