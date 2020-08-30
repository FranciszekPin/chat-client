package com.franciszekpin.emailclient;

public class ActionSend extends Action{
    private String emailAddress;
    private Outbox outbox;

    public ActionSend(Outbox outbox, String emailAddress) {
        this.emailAddress = emailAddress;
        this.outbox = outbox;
    }

    @Override
    public void handleAction() {
        outbox.send(new Mail(emailAddress, "topic", "content"));
    }
}
