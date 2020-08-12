package com.geekykel.pattern.structural.facadepattern;

public class Bathroom {
    private String description = "The tub";
    private String favoriteTemperature;
    private String favoriteLevel;

    public void fill() {
        System.out.println(description + " is being filled");
        System.out.println("Temperature: " + this.favoriteTemperature);
        System.out.println("Water level: " + this.favoriteLevel);
    }

    public void drain() {
        System.out.println(description + " is being drained");
    }

    public void setFavoriteTemperature(String favoriteTemperature) {
        this.favoriteTemperature = favoriteTemperature;
    }

    public void setFavoriteLevel(String favoriteLevel) {
        this.favoriteLevel = favoriteLevel;
    }

    //StereoSystem on
//    Favorite song is playing! Queen - Killer Queen
//    The tub is being filled
//    Temperature: 35℃
//    Water level: 60%
//    Lights on
//    Color temperature is: Calming blue
//    The tub is being drained
//    StereoSystem off
//    Lights off
}
