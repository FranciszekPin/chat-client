package com.franciszekpin.emailclient;

public class ActionSend extends Action{
    private String messageContent;
    private Outbox outbox;

    public ActionSend(Outbox outbox, String messageContent) {
        this.messageContent = messageContent;
        this.outbox = outbox;
    }

    @Override
    public void handleAction() {
        outbox.send(new Message(messageContent, "topic", "content"));
    }
}
