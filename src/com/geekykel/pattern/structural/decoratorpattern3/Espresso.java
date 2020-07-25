package com.geekykel.pattern.structural.decoratorpattern3;

public class Espresso extends Coffee {
    Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
