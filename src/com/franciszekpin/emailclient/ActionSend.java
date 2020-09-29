package com.franciszekpin.emailclient;

import java.sql.Date;

public class ActionSend extends Action{
    private String messageContent;
    private Outbox outbox;

    public ActionSend(Outbox outbox, String messageContent) {
        this.messageContent = messageContent;
        this.outbox = outbox;
    }

    @Override
    public void handleAction() {
        outbox.send(new Message(1, Date.valueOf("2020-10-04"), messageContent));
    }
}
