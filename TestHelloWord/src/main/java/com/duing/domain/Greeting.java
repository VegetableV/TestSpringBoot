package com.duing.domain;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class Greeting {

    private Long id;
    private String content;


}
