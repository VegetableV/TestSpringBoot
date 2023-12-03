package com.mybatis.controller;



import com.mybatis.entity.Guset;
import com.mybatis.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        Guset guset = new Guset();
        guests.add(guset);
        model.addAttribute("guestList",guests);
        return "list";
    }
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }


    @PostMapping("/add")
    @Transactional
    public String add( Guset guset){
        guestService.save(guset);
        return "redirect:list";
    }


}
