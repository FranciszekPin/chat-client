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
        List<Mail> mails = inbox.getMails();
        for (Mail each : mails) {
            System.out.println(each.getAddress());
        }
    }
}
