package com.geekykel.pattern.creational.abstractfactory;

public class DellXPSFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new DellXPSDetailsFactory();

        return new DellXPS(detailsFactory);
    }
}
