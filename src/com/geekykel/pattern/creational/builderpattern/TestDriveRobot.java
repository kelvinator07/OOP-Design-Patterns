package com.geekykel.pattern.creational.builderpattern;

import java.util.Scanner;

public class TestDriveRobot {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();

        Robot robot = new Robot.RobotBuilder()
                .setCPU("Intel Core i5")
                .setLegs(legs)
                .setHands(hands)
                .setEyes(eyes).build();

        System.out.println(robot);
        scanner.close();
    }
}
