package com.event.listneter;

import com.event.event.ConditionEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class EventListenter1 implements ApplicationListener<ConditionEvent> {
    @Override
    public void onApplicationEvent(ConditionEvent event) {
        event.print("第一个监听器执行");
    }
}
