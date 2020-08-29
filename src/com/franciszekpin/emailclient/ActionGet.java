package com.franciszekpin.emailclient;

public class ActionGet extends Action {
    private int numberOfMessagesToGet;

    public ActionGet(int numberOfMessagesToGet) {
        this.numberOfMessagesToGet = numberOfMessagesToGet;
    }

    @Override
    public void handleAction() {
        System.out.println("Get " + this.numberOfMessagesToGet + " messages");
    }
}
