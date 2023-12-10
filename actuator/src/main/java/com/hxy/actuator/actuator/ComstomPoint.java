package com.hxy.actuator.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "comstom")
public class ComstomPoint {
    @ReadOperation
    @ResponseBody
    public Map<String,String> newPoint(){
        Map<String,String> map=new HashMap<>();
        map.put("Comstomer","hello Comstom point");
        return map;
    }
}
