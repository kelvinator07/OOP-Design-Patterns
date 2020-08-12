package com.geekykel.pattern.structural.facadepattern;

public class Lights {
//    String description = "Lights";

//    public void on() {
//        System.out.println(description + " on");
//    }
//
//    public void off() {
//        System.out.println(description + " off");
//    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    public String toString() {
        return description;
    }

    private String description = "Lights";
    private String favoriteColorTemperature;

    public void on() {
        System.out.println(description + " on");
        System.out.println("Color temperature is: " + this.favoriteColorTemperature);
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setFavoriteColorTemperature(String favoriteColorTemperature) {
        this.favoriteColorTemperature = favoriteColorTemperature;
    }
}
