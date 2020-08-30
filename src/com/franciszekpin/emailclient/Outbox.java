package com.franciszekpin.emailclient;

public class Outbox {
    public void send(Mail mail) {
        System.out.println("Send message to address " + mail.getAddress());
    }
}
