package com.geekykel.pattern.structural.facadepattern;

public class Engine {
    private String description;

    Engine() {
        this.description = "Engine";
    }

    void on() {
        System.out.println(description + " is on");
    }

    void off() {
        System.out.println(description + " is off");
    }
}
