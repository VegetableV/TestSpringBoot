package com.thymeleafcrud.controller;

import com.thymeleafcrud.bean.Guest;
import com.thymeleafcrud.service.GuestService;
import jakarta.servlet.http.HttpServletRequest;
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
        List<Guest> guests = guestService.list();
        model.addAttribute("guestList",guests);
        return "list";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        String name = request.getParameter("name");
        String role = request.getParameter("role");
        Guest guest=new Guest(name,role);
        guestService.add(guest);

        return "redirect:/guest/list";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

}
