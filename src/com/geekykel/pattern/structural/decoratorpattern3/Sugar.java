package com.geekykel.pattern.structural.decoratorpattern3;

public class Sugar extends Decorator {
    private Coffee coffee;

    /* write constructor */
    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    double cost() {
        return .02 + coffee.cost();
    }
}
