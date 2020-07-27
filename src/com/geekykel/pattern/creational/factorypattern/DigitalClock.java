package com.geekykel.pattern.creational.factorypattern;

public class DigitalClock implements Clock {
    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}
