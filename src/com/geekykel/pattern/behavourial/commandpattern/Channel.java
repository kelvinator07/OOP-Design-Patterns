package com.geekykel.pattern.behavourial.commandpattern;

public class Channel {
    private int channelNumber;

    Channel(int channelNumber) {
        /* write your code here */
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        System.out.println("Channel was changed to " + channelNumber);
    }
}
