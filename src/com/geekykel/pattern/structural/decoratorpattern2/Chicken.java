package com.geekykel.pattern.structural.decoratorpattern2;

public class Chicken extends Decorator {
    private Pizza pizza;

    Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double cost() {
        return 1.5 + pizza.cost();
    }
}
