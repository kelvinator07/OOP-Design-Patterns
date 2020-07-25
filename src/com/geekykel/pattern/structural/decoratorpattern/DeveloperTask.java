package com.geekykel.pattern.structural.decoratorpattern;

public class DeveloperTask {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDeveloper(
                        new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
