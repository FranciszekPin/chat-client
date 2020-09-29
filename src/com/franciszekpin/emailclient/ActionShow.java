package com.franciszekpin.emailclient;

import java.util.List;
import java.util.ArrayList;

public class ActionShow extends Action {
    private Inbox inbox;
    ActionShow(Inbox inbox) {
        this.inbox = inbox;
    }
    @Override
    public void handleAction() {
        if (!inbox.isEmpty()) {
            List<Message> mails = inbox.getMails();
            for (Message each : mails) {
                System.out.println(each.getAddress());
            }
        }
        else {
            System.out.println("Inbox is empty, type 'get [numerOfMessages]'");
        }
    }
}
