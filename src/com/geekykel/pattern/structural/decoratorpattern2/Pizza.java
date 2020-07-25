package com.geekykel.pattern.structural.decoratorpattern2;

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

