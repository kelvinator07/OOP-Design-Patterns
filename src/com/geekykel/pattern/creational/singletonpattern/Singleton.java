package com.geekykel.pattern.creational.singletonpattern;

public class Singleton {

    private static Singleton instance;

    public String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public void printData() {
        System.out.print(data + " ");
    }

}
