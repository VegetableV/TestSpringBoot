package com.exception.controller;

import com.exception.domain.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ExceptionController {

    @GetMapping("/")
    public String test(@Valid Guest guest, BindingResult result){
        if (result.getErrorCount()>0){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringBuffer stringBuffer=new StringBuffer();
            for (FieldError fieldError:fieldErrors){
                stringBuffer.append(fieldError.getField()+"\t"+fieldError.getDefaultMessage());
                stringBuffer.append("\n");

            }
            return stringBuffer.toString();
        }
        return "success";
    }
}
