package com.franciszekpin.emailclient;

public class ActionGet extends Action {
    private int numberOfMessagesToGet;
    private Inbox inbox;

    public ActionGet(Inbox inbox, int numberOfMessagesToGet) {
        this.inbox = inbox;
        this.numberOfMessagesToGet = numberOfMessagesToGet;
    }

    @Override
    public void handleAction() {
        inbox.downloadMails(numberOfMessagesToGet);
    }
}
