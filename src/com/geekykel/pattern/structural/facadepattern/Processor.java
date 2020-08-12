package com.geekykel.pattern.structural.facadepattern;

public class Processor {
    String description = "Processor";

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}
