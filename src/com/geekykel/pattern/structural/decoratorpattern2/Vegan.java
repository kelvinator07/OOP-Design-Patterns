package com.geekykel.pattern.structural.decoratorpattern2;

public class Vegan extends Pizza {
    Vegan() {
        description = "Vegan";
    }

    @Override
    double cost() {
        return 4.99;
    }
}
