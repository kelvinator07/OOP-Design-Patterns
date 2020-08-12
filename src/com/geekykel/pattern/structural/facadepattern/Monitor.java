package com.geekykel.pattern.structural.facadepattern;

public class Monitor {
    String description = "Monitor";

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}
