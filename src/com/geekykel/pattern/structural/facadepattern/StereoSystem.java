package com.geekykel.pattern.structural.facadepattern;

public class StereoSystem {
//    private String description;
    private String trackTitle;
    private int volume;

    StereoSystem() {
//        this.description = "Stereo system";
        this.volume = 50;
    }

//    void on() { System.out.println(description + " is turning on"); }

//    void off() { System.out.println(description + " is turning off"); }

    void playTrack(String title) {
        this.trackTitle = title;
        System.out.println(title + " is playing");
    }

    public void pause() {
        System.out.println("Track: \"" + trackTitle + "\" were paused");
    }

    public String getTrackTitle() {
        return ("The current track is: \"" + trackTitle + "\"");
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    private String description = "StereoSystem";
    private String favoriteSong;

    public void on() {
        System.out.println(description + " on");
        turnOnFavoriteSong();
    }

    public void off() {
        System.out.println(description + " off");
    }

    private void turnOnFavoriteSong() {
        System.out.println("Favorite song is playing! " + this.favoriteSong);
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
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
