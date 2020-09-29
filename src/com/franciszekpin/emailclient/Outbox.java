package com.franciszekpin.emailclient;

public class Outbox {
    public void send(Message message) {
        System.out.println("Send message to address " + message.getAddress());
    }
}
