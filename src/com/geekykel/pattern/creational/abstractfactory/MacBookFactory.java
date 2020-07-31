package com.geekykel.pattern.creational.abstractfactory;

public class MacBookFactory implements LaptopFactory {
    @Override
    public Laptop createComputer() {
        LaptopDetailsFactory detailsFactory = new MacBookDetailsFactory();

        return new MacBook(detailsFactory);
    }
}
