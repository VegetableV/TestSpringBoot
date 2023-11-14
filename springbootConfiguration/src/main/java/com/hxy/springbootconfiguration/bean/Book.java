package com.hxy.springbootconfiguration.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
