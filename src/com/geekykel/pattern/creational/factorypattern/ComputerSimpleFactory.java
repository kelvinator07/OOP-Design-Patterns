package com.geekykel.pattern.creational.factorypattern;

public class ComputerSimpleFactory {

    // it may contain some fields

    public Computer newInstance(String type) {
        if (type.equals("Computer")) {
            return new Computer();
        } else if (type.equals("PC")) {
            return new PC();
        } else if (type.equals("Laptop")) {
            return new Laptop();
        }
        return null; // if not a suitable type
    }
}
