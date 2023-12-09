package com.exception;

import com.exception.domain.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Guest guest=new Guest();
        guest.setName("");
        guest.setRole("");
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Validator validator1 = Validation.byDefaultProvider().configure().addProperty("hibernate.validator.fail_fast", "true").buildValidatorFactory().getValidator();
        Set<ConstraintViolation<Guest>> validates = validator.validate(guest);
        for (ConstraintViolation<Guest> validate:validates){
            System.out.println(validate.getPropertyPath()+","+validate.getMessage());
        }
        System.out.println("------------------------");
        Set<ConstraintViolation<Guest>> validates2 = validator1.validate(guest);
        for (ConstraintViolation<Guest> validate:validates2){
            System.out.println(validate.getPropertyPath()+","+validate.getMessage());
        }
    }
}
