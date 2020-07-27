package com.geekykel.pattern.creational.factorypattern;

import java.util.Scanner;

public class MotorFactory {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        final Motor motor = MotorStaticFactory.make(type, model, power);
        if (motor == null) {
            System.out.println(motor);
        } else {
            System.out.println(motor.getClass().getName() + " " + motor.model + " " + motor.power);
            System.out.println(motor.getClass().getName() + "={model:" + motor.model + ",power:" + motor.power);
        }
        // Electric motor={model:R-45,power:1000}
    }
}
