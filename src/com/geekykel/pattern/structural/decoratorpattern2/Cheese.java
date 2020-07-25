package com.geekykel.pattern.structural.decoratorpattern2;

public class Cheese extends Decorator {
    private Pizza pizza;

    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {
        return .20 + pizza.cost();
    }
}
