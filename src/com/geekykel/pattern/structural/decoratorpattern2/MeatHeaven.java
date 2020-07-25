package com.geekykel.pattern.structural.decoratorpattern2;

public class MeatHeaven extends Pizza {
    MeatHeaven() {
        description = "MeatHeaven";
    }

    @Override
    double cost() {
        return 4.0;
    }
}
