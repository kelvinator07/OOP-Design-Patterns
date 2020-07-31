package com.geekykel.pattern.creational.abstractfactory;

public abstract class Burger {
    static final String CHEESE = "cheese";
    static final String HAMBURGER = "hamburger";
    static final String VEGAN = "vegan";

    String box;
    String name;
    Bun bun;
    Cutlet cutlet;
    Sauce sauce;
    Cheese cheese;

    abstract void collect();

    void box() {
        if (box != null) {
            System.out.println("Placing in official " + box);
        } else {
            System.out.println("Placing in official BurgerStore box");
        }
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBox(String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (bun != null) {
            result.append(bun);
            result.append("\n");
        }
        if (cutlet != null) {
            result.append(cutlet);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}
