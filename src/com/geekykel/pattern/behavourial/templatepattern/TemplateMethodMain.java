package com.geekykel.pattern.behavourial.templatepattern;

import java.util.Scanner;

public class TemplateMethodMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String author = scanner.nextLine();
        scanner.close();
        Meal meal = new Steak();
        System.out.println(author + " wants to eat");
        System.out.println(author + " decides to cook meal");
        meal.doMeal();
    }
}
