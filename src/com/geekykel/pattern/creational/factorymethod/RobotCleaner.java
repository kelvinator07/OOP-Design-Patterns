package com.geekykel.pattern.creational.factorymethod;

public class RobotCleaner extends Robot {

    private String name;
    private String description;
    private int power;

    public RobotCleaner(String name, String description, int power) {
        this.name = name;
        this.description = description;
        this.power = power;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return "cleaner-" + super.toString();
    }
}
