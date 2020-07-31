package com.geekykel.pattern.creational.abstractfactory;

public abstract class BurgerStore {
    protected abstract Burger createBurger(String type);

    Burger orderBurger(String type) {
        Burger burger = createBurger(type);
        System.out.println("--- Making a " + burger.getName() + " ----");
        burger.collect();
        burger.box();
        return burger;
    }
}
