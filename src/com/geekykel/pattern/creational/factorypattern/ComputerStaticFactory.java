package com.geekykel.pattern.creational.factorypattern;

public class ComputerStaticFactory {

    public static Computer newInstance(String type) {
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
