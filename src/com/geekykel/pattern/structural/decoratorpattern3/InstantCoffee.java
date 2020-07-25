package com.geekykel.pattern.structural.decoratorpattern3;

public class InstantCoffee extends Coffee {
    InstantCoffee() {
        description = "Instant Coffee";
    }

    @Override
    double cost() {
        return 1.0;
    }
}
