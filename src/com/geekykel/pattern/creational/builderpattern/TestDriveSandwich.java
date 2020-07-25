package com.geekykel.pattern.creational.builderpattern;

import java.util.Scanner;

public class TestDriveSandwich {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /* Hello, which bun would like to? */
        String bun = scanner.nextLine();
        /* How much salad would like to add? */
        int salad = Integer.valueOf(scanner.nextLine());
        /* How much cheese would like to add? */
        int cheese = Integer.valueOf(scanner.nextLine());
        /* How much cucumber would like to add? */
        int cucumber = Integer.valueOf(scanner.nextLine());
        /* How much ham would like to add? */
        int ham = scanner.nextInt();

        Sandwich sandwich = new Sandwich.Builder()
                .addBun(bun)
                .addSalad(salad)
                .addCheese(cheese)
                .addCucumber(cucumber)
                .addHam(ham).build();

        System.out.println(sandwich);
        scanner.close();
    }
}
