package com.geekykel.pattern.creational.factorymethod;

public class LaptopStore extends LaptopFactory {
    @Override
    Laptop createLaptop(String type) {
        switch (type) {
            case "13 inch":
                return new Laptop13("13 inch Laptop");
            case "15 inch":
                return new Laptop15("15 inch Laptop");
            case "17 inch":
                return new Laptop17("17 inch Laptop");
            default:
                return null;
        }
    }
}
