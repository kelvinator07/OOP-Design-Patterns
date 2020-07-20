package com.geekykel;

public class A {

    private static A instance;

    private String s;

    private A (String s) {
        this.s = s;
    }

    public static A getInstance(String s) {
        if (instance == null) {
            instance = new A(s);
        }
        return instance;
    }

    public static A getNewInstance(String s) {
        return new A(s);
    }

    public String getS() {
        return s;
    }
}