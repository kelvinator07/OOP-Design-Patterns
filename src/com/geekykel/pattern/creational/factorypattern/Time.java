package com.geekykel.pattern.creational.factorypattern;

public class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here

        return of(12,0,0);
    }

    public static Time midnight() {
        // write your code here

        return of(0,0,0);
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        int tmp = (int) (seconds / 3600);
        int hour = tmp > 23 ? (tmp % 24) : tmp;
        int minutes = (int) ((seconds % 3600) / 60);
        //LocalTime.MIN.plusSeconds(seconds);
        return of(hour,minutes,0);
    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
//        hours = Math.floor(totalSeconds / 3600);
//        totalSeconds %= 3600;
//        minutes = Math.floor(totalSeconds / 60);
//        seconds = totalSeconds % 60;
//        if (0 <= hour <= 23) {
//            int h = (int) (second / 3600) % 24;
//            return of(12,0,0);
//        } else {
//            return null;
//        }
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
//            hour = Math.floor(totalSeconds / 3600);
//        totalSeconds %= 3600;
//        minute = Math.floor(totalSeconds / 60);
//        second = totalSeconds % 60;

        } else {
            return null;
        }
        return null;

    }
}
