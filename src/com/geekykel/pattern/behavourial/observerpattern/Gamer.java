package com.geekykel.pattern.behavourial.observerpattern;

import java.util.HashSet;
import java.util.Set;

public class Gamer implements ObserverG {
    private String name;
    ObservableG observable;
    private Set<String> games = new HashSet<>();

    public Gamer(String name, ObservableG observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update(String games) {
        System.out.println("Notification for gamer : " + this.name);
        buyGame(games);
    }

    public void buyGame(String game) {
        if (games.contains(game)) {
            System.out.println("What? They've already released this game ... I don't understand");
        } else {
            System.out.println(name + " says : \"Oh, Rockstar releases new game " + game + " !\"");
        }
        games.add(game);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
