package com.geekykel.pattern.creational.factorypattern;

public class ShapeFactory {
    public Shape getShape(String type) {
        type = type.toUpperCase();

        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "POLYGON":
                return new Polygon();
            default:
                return null;
        }
    }
}
