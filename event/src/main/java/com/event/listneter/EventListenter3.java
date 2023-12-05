package com.event.listneter;

import com.event.event.ConditionEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenter3 {

    @EventListener
    public void listenter(ConditionEvent event){
        event.print("第三个监听器执行");
    }
}
