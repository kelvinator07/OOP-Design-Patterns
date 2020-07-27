package com.geekykel.pattern.creational.factorypattern;

public class FactoryDesignPattern {

    public static void main(String args[]) {

        // Static Factory idiom
        Computer pc = ComputerStaticFactory.newInstance("PC");
        System.out.println(pc instanceof PC); // prints "true"

        Computer laptop = ComputerStaticFactory.newInstance("Laptop");
        System.out.println(laptop instanceof Laptop); // prints "true"

        // Simple Factory idiom
        ComputerSimpleFactory factory = new ComputerSimpleFactory();
        Computer personal = factory.newInstance("PC");

    }
}
