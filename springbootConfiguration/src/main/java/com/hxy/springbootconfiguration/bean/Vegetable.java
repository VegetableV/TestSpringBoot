package com.hxy.springbootconfiguration.bean;

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

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public Vegetable(String potato, String eggplant, String green) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.green = green;
    }

    public Vegetable() {
    }
}
