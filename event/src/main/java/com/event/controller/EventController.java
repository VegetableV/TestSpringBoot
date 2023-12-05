package com.event.controller;

import com.event.event.ConditionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Flow;

@RestController
public class EventController {
    @Autowired
    private ApplicationEventPublisher publisher;
    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new ConditionEvent(this));
        return "success";
    }


}
