package com.geekykel.pattern.structural.facadepattern;

public class SmartHouseFacadeTestDrive {
    public static void main(String[] args) {
        StereoSystem stereoSystem = new StereoSystem();
        Bathroom bathroom = new Bathroom();
        Lights lights = new Lights();

        SmartHouseFacade smartHouseFacade = new SmartHouseFacade(stereoSystem, bathroom, lights);

        lights.setFavoriteColorTemperature("Calming blue");
        stereoSystem.setFavoriteSong("Queen - Killer Queen");
        bathroom.setFavoriteTemperature("35℃");
        bathroom.setFavoriteLevel("60%");

        smartHouseFacade.cameHome();
        smartHouseFacade.leaveBathroomGoSleep();
    }

//    StereoSystem on
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
