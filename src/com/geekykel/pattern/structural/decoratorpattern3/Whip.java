package com.geekykel.pattern.structural.decoratorpattern3;

public class Whip extends Decorator {
    private Coffee coffee;

    /* write constructor */
    public Whip(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return .10 + coffee.cost();
    }
}
