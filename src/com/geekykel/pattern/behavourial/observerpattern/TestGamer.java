package com.geekykel.pattern.behavourial.observerpattern;

import java.util.*;

public class TestGamer {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String game = null;

        RockstarGames rockstarGames = new RockstarGames();

        Gamer garry = new Gamer("Garry Rose", rockstarGames);
        Gamer peter = new Gamer("Peter Johnston", rockstarGames);
        Gamer helen = new Gamer("Helen Jack", rockstarGames);

        rockstarGames.addObserver(garry);
        rockstarGames.addObserver(peter);
        rockstarGames.addObserver(helen);

        for (int i = 0; i < 2; i++) {
            game = scanner.nextLine();
            rockstarGames.release(game);
        }

        scanner.close();
    }

//    Notification for gamer : Garry Rose
//    Garry Rose says : "Oh, Rockstar releases new game GTA 5 !"
//    Notification for gamer : Peter Johnston
//    Peter Johnston says : "Oh, Rockstar releases new game GTA 5 !"
//    Notification for gamer : Helen Jack
//    Helen Jack says : "Oh, Rockstar releases new game GTA 5 !"
//    Notification for gamer : Garry Rose
//    What? They've already released this game ... I don't understand
//    Notification for gamer : Peter Johnston
//    What? They've already released this game ... I don't understand
//    Notification for gamer : Helen Jack
//    What? They've already released this game ... I don't understand
}
