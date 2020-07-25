package com.geekykel.pattern.structural.decoratorpattern2;

public class Broccoli extends Decorator {
    private Pizza pizza;

    Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double cost() {
        return .10 + pizza.cost();
    }
}
