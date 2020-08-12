package com.geekykel.pattern.structural.facadepattern;

public class Projector {
    String description = "Projector";

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}
