package com.geekykel.pattern.behavourial.strategypattern;

public class SmsSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("send SMS from '%s' to '%s'", from, to));
    }

    @Override
    public void send(Message message) {
        System.out.println(String.format("send SMS from '%s' to '%s'", message.from, message.to));
    }
}
