package com.hxy.springbootconfiguration.bean;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Vegetable {
    private String potato;
    private String eggplant;
    private String green;

    @Override
    public String toString() {
        return "Vegetable{" +
                "potato='" + potato + '\'' +
                ", eggplant='" + eggplant + '\'' +
                ", green='" + green + '\'' +
                '}';
    }

}
