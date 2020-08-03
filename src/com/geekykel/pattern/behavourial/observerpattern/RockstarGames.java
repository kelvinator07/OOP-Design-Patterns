package com.geekykel.pattern.behavourial.observerpattern;

import java.util.ArrayList;

public class RockstarGames implements ObservableG {

    public String releaseGame;

    private ArrayList<ObserverG> observers = new ArrayList<>();

    @Override
    public void addObserver(ObserverG observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverG observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(ObserverG observer: observers) {
            observer.update(this.releaseGame);
        }
    }

    public void release(String game) {
        this.releaseGame = game;
        notifyObserver();
    }
}
