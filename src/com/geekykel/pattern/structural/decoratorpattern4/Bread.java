package com.geekykel.pattern.structural.decoratorpattern4;

abstract class Bread {
    String description;
    int kcal;

    String getDescription() {
        return description;
    }

    int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return getDescription() + ". kCal: " + getKcal();
    }
}
