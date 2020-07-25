package com.geekykel.pattern.creational.builderpattern;

import java.util.Arrays;
import java.util.Scanner;

public class TestDriveGeek {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String geekName = scanner.nextLine();
        scanner.close();
        System.out.println("Geek " + geekName + " created.");

        Geek geek = new Geek.GeekBuilder()
                .setType("Admin")
                .setLanguages(Arrays.asList("Perl","PowerShell"))
//                .setLanguages(new ArrayList<>() {{
//                    add("Perl");
//                    add("PowerShell");
//                }})
                .setExperience(10)
                .build();

        System.out.println(geek);
    }
}
