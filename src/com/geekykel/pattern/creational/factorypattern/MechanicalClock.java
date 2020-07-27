package com.geekykel.pattern.creational.factorypattern;

public class MechanicalClock implements Clock {
    @Override
    public void tick() {
        System.out.println("...clang mechanism...");
    }
}
