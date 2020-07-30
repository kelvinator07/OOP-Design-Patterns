package com.geekykel.pattern.behavourial.strategypattern;

public class StrategyMain {

    public static void main(String[] args) {

        MessageSender sender = new MessageSender(); // create a message sender

        sender.setMethod(new EmailSendingMethod()); // set a concrete sending method
        sender.send("alice@gmail.com", "bob@gmail.com", "Hello!");
        sender.send("alice@gmail.com", "bob@gmail.com", "Hello!");
        // Email from 'alice@gmail.com' to 'bob@gmail.com'

        sender.setMethod(new SmsSendingMethod()); // set another sending method
        sender.send("1-541-444-3333", "1-541-555-2222", "Hello!");
        sender.send("1-541-444-3333", "1-541-555-2222", "Hello!");
        // send SMS from '1-541-444-3333' to '1-541-555-2222'

        // PushSendingMethod with extra Fields and constructors
        sender.setMethod(new PushSendingMethod(true));

    }
}
