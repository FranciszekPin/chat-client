package com.franciszekpin.emailclient;

public class ActionSend extends Action{
    private String emailAddress;

    public ActionSend(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void handleAction() {
        System.out.println("Send on " + this.emailAddress + " address");
    }
}
