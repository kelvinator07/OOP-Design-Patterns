package com.geekykel.pattern.structural.decoratorpattern4;

public class TestDrive {
    public static void main(String[] args) {
        Bread bagel = new Bagel();

        bagel = new Butter(bagel);
        bagel = new Butter(bagel);
        bagel = new Ham(bagel);
        bagel = new Cheese(bagel);

        System.out.println(bagel);

        Bread bun = new Bun();
        bun = new Butter(bun);
        bun = new Jam(bun);
        bun = new Jam(bun);

        System.out.println(bun);
    }

//    Bagel, Butter, Butter, Ham, Cheese. kCal: 2890
//    Bun, Butter, Jam, Jam. kCal: 440
}
