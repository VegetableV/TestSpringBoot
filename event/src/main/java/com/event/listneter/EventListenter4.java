package com.event.listneter;

import com.event.event.ConditionEvent;
import org.springframework.context.ApplicationListener;

public class EventListenter4 implements ApplicationListener<ConditionEvent> {
    @Override
    public void onApplicationEvent(ConditionEvent event) {
        event.print("第四个监听器");
    }
}
