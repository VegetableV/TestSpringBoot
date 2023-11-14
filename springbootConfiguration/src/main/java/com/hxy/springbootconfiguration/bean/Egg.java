package com.hxy.springbootconfiguration.bean;

public class Egg {
    private String egg;
    private String rice;

    public Egg(String egg, String rice) {
        this.egg = egg;
        this.rice = rice;
    }

    public Egg() {
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }
}
