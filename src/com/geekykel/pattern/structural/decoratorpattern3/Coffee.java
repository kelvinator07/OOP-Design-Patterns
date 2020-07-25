package com.geekykel.pattern.structural.decoratorpattern3;

abstract class Coffee {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}
