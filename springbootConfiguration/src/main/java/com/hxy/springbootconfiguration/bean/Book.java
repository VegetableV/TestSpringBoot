package com.hxy.springbootconfiguration.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String name;
    private Double price;
    private String[] type;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ",type="+type+
                '}';
    }


}
