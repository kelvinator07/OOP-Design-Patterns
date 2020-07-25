package com.geekykel.pattern.structural.decoratorpattern3;

public class Milk extends Decorator {
    private Coffee coffee;

    /* write constructor */

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return .13 + coffee.cost();
    }
}
