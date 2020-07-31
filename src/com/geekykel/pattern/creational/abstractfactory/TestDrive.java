package com.geekykel.pattern.creational.abstractfactory;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Laptop laptop;

        LaptopFactory dellFactory = new DellXPSFactory();
        LaptopFactory macbookFactory = new MacBookFactory();

        System.out.println("-Hello, I need a Windows laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the DellXPSFactory. " +
                "-Bring me a Dell laptop");

        laptop = new DellXPS(new DellXPSDetailsFactory());
        System.out.println(laptop.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need a macOS laptop");
        System.out.println("-Okay! Please wait a sec, - Calling to the MacBookFactory. " +
                "-Bring me a MacBook laptop");

        laptop = new MacBook(new MacBookDetailsFactory());
        System.out.println(laptop.getDescription());
        System.out.println("There it is!");
    }
}
