package com.geekykel.pattern.creational.abstractfactory;

public class TestDrivePhone {
    public static void main(String[] args) throws InterruptedException {
        Phone phone;

        PhoneFactory iphoneFactory = new IphoneFactory();
        PhoneFactory samsungFactory = new SamsungFactory();

        System.out.println("-Hello, I need Android phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the SamsungFactory. -Bring me the Samsung Galaxy S10");
        Thread.sleep(1500);

        phone = new Iphone(new IphoneDetailsFactory());
        System.out.println(phone.getDescription());
        System.out.println("There it is!\n");

        System.out.println("-Hello, I need iOS phone");
        System.out.println("-Okay! Please wait for a sec, - Calling to the iPhoneFactory. -Bring me the iPhoneXS\"");
        Thread.sleep(1500);

        phone = new Samsung(new SamsungDetailsFactory());
        System.out.println(phone.getDescription());
        System.out.println("There it is!");
    }
}
