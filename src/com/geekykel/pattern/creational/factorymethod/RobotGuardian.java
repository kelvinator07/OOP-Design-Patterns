package com.geekykel.pattern.creational.factorymethod;

public class RobotGuardian extends Robot {
    private String name;
    private String description;
    private int power;

    public RobotGuardian(String name, String description, int power) {
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
        return "guardian-" + super.toString();
    }
}
