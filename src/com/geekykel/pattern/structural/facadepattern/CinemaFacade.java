package com.geekykel.pattern.structural.facadepattern;

public class CinemaFacade {
    private PopcornPopper popcorn;
    private Lights lights;
    private Projector projector;

    public CinemaFacade(PopcornPopper popcorn, Lights lights, Projector projector) {
        this.popcorn = popcorn;
        this.lights = lights;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        popcorn.on();
        popcorn.pop();
        lights.off();
        projector.on();
    }

    public void endMovie() {
        popcorn.off();
        lights.on();
        projector.off();
    }
}
