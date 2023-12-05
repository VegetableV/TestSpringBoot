package com.event.event;

import com.event.EventApplication;
import org.springframework.context.ApplicationEvent;

public class ConditionEvent extends ApplicationEvent {
    public ConditionEvent(Object source) {
        super(source);
    }
    public void print(String msg){
        System.out.println("自定义事件，打印信息："+msg);

    }
}
