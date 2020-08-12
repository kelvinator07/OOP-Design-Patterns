package com.geekykel.pattern.structural.facadepattern;

public class TestCinemaFacade {
    public static void main(String[] args) throws InterruptedException {
        PopcornPopper popcorn = new PopcornPopper();
        Lights lights = new Lights();
        Projector projector = new Projector();

        CinemaFacade cinemaFacade = new CinemaFacade(popcorn, lights, projector);

        cinemaFacade.watchMovie();
        System.out.println("We are watching a movie");
        Thread.sleep(5000);
        System.out.println("The End");
        cinemaFacade.endMovie();

//        Get ready to watch a movie...
//        PopcornPopper on
//        PopcornPopper popping popcorn!
//                Lights off
//        Projector on
//        We are watching a movie
//        The End
//        PopcornPopper off
//        Lights on
//        Projector off
    }
}
