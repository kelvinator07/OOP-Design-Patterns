package com.geekykel.pattern.creational.singletonpattern;

public class AppController {

    private static AppController instance;

    public AppConfig config;

    private AppController(AppConfig config) {
        this.config = config;
    }

    public static AppController getInstance() {
        if (instance == null) {
            instance = new AppController(loadConfig());
        }
        return instance;
    }

    private static AppConfig loadConfig() {
        return new AppConfig(1000, "https://hyperskill.org");
    }
}
