package com.example.cache.controller;



import com.example.cache.entity.Guest;
import com.example.cache.mapper.GusetMapper;
import com.example.cache.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    @GetMapping("/list")
    public List<Guest> list(Model model){
        List<Guest> guests = guestService.list();
        Guest guset = new Guest();
        guests.add(guset);
        model.addAttribute("guestList",guests);
        return guests;
    }

    @GetMapping("/{id}")
    public Guest selectById(@PathVariable(name = "id") Integer id){
        return guestService.selectById(id);
    }
    @GetMapping("/update")
    public Guest updateGuest(Integer id, String name, String role) {
        Guest newGuest = new Guest(id, name, role);
        guestService.save(newGuest);
        return newGuest;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id) {
        guestService.delete(id);
        return "Success";
    }





}
