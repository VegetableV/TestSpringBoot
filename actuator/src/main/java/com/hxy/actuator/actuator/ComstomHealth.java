package com.hxy.actuator.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ComstomHealth implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode=1;
        if (errorCode!=0){
            return Health.down().withDetail("error",errorCode).build();
        }

        return Health.up().build();
    }
}
