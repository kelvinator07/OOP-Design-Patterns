package com.geekykel.pattern.behavourial.observerpattern;

public class YoutubeSubscriber implements Observer {

    private Observable observable;

    public YoutubeSubscriber(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("New video on channel!");
    }
}
