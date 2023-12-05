package com.event.listneter;

import com.event.event.ConditionEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenter2 implements ApplicationListener<ConditionEvent> {
    @Override
    public void onApplicationEvent(ConditionEvent event) {
        event.print("第二个监听器执行");
    }
}
