package com.geekykel.pattern.creational.factorymethod;

public class RobotFactory {
    public Robot getRobot(RobotType type, String name, String description, int power) {
        /** write your code here ... */
        if (type.equals(RobotType.ROBOT_CLEANER)) {
            return new RobotCleaner(name, description, power);
        } else if (type.equals(RobotType.ROBOT_GUARDIAN)) {
            return new RobotGuardian(name, description, power);
        } else return null;


    }
}
