package com.geekykel.pattern.creational.factorypattern;

public class ToyClock implements Clock {
    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}
