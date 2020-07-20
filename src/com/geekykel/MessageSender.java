package com.geekykel;

public class MessageSender {

    private SendingMethod method;

    // it may contain additional fields as well

    public void setMethod(SendingMethod method) {
        this.method = method;
    }

    public void send(String from, String to, String msg) {
        this.method.send(from, to, msg);
    }

    public void send(Message message) {
        this.method.send(message.from, message.to, message.text);
    }
}
