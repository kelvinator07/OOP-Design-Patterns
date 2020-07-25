package com.geekykel.pattern.creational.builderpattern;

import java.util.Scanner;

public class GeekMain {
    public static void main(String[] args) {
//        final Scanner scanner = new Scanner(System.in);
//        final String geekName = scanner.nextLine();
//        scanner.close();
//        System.out.println("Geek " + geekName + " created.");
//        GeekDirector director = new GeekDirector();
//        GeekBuilder builder = new GeekBuilder();
//        director.buildAdmin(builder);
//        GeekConcreteComponent geek = builder.getResult();
//        System.out.println(geek);

        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        final String geekType = scanner.nextLine();
        scanner.close();
        GeekDirector director = new GeekDirector();
        GeekBuilder builder = new GeekBuilder();
        GeekConcreteComponent geek = null;
        if ("Rockstar".equals(geekType)) {
            director.buildRockstar(builder);
            geek = builder.getResult();
        } else if ("Backend".equals(geekType)) {
            director.buildBackend(builder);
            geek = builder.getResult();
        } else if ("Admin".equals(geekType)) {
            director.buildAdmin(builder);
            geek = builder.getResult();
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Geek " + geekName + " created.");
        System.out.println(geek);

    }
}
