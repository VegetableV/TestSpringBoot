package com.event;

import com.event.listneter.EventListenter1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(EventApplication.class, args);
        run.addApplicationListener(new EventListenter1());
    }

}
