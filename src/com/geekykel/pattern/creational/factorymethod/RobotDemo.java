package com.geekykel.pattern.creational.factorymethod;

import java.util.Scanner;

public class RobotDemo {
    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        Scanner scanner = new Scanner(System.in);

        String nameCleaner = scanner.nextLine();
        Robot robotCleaner = robotFactory.getRobot(RobotType.ROBOT_CLEANER, nameCleaner,
                "Robot will clean my room and dry my socks", 100);

        String nameGuardian = scanner.nextLine();
        Robot robotGuardian = robotFactory.getRobot(RobotType.ROBOT_GUARDIAN, nameGuardian,
                "Knight will secure my daughter while she sleeping", 200);

        System.out.println(robotCleaner);
        System.out.println(robotGuardian);

        scanner.close();
    }
}
