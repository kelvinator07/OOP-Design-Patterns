package com.geekykel.pattern.behavourial.observerpattern;

public interface ObservableG {
    public void addObserver(ObserverG observer);
    public void removeObserver(ObserverG observer);
    public void notifyObserver();
}
