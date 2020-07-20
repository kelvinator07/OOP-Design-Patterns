package com.geekykel;

public interface SendingMethod {
    void send(String from, String to, String msg);
    void send(Message message);
}
