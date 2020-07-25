package com.geekykel.pattern.structural.decoratorpattern3;

import java.util.Locale;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Coffee simpleEspresso = new Espresso();
        System.out.println(simpleEspresso.getDescription() + " $" + formatSum(simpleEspresso.cost()));

        Coffee espressoWithDecor = new Espresso();
        espressoWithDecor = new Milk(espressoWithDecor);
        espressoWithDecor = new Sugar(espressoWithDecor);
        System.out.println(espressoWithDecor.getDescription() + " $" + formatSum(espressoWithDecor.cost()));

        Coffee instantWithDecor = new InstantCoffee();
        instantWithDecor = new Whip(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        instantWithDecor = new Sugar(instantWithDecor);
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.cost()));

        System.out.println("I'm drinking my " + instantWithDecor.getDescription());
        Thread.sleep(1500);
        System.out.println("-I want to add some Whip to my coffee. And don't make a new one! Just add Whip");
        Thread.sleep(1500);
        System.out.println("-Okay! But the final price will change");
        Thread.sleep(1500);
        System.out.println("-I understand");

        instantWithDecor = new Whip(instantWithDecor);
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.cost()));
    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }

//    Espresso $1.99
//    Espresso, Milk, Sugar $2.14
//    Instant Coffee, Whip, Sugar, Sugar, Sugar $1.16
//    I'm drinking my Instant Coffee, Whip, Sugar, Sugar, Sugar
//            -I want to add some Whip to my coffee. And don't make a new one! Just add Whip
//            -Okay! But the final price will change
//      -I understand
//    Instant Coffee, Whip, Sugar, Sugar, Sugar, Whip $1.26
}
