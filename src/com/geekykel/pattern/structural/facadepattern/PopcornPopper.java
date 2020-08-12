package com.geekykel.pattern.structural.facadepattern;

public class PopcornPopper {
    String description = "PopcornPopper";

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }
}
