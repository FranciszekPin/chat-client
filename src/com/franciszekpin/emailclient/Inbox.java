package com.franciszekpin.emailclient;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Inbox {
    private List<Message> mails;
    private boolean isEmpty;

    public Inbox() {
        this.isEmpty = true;
    }

    public void downloadMails(int x) {
        mails = new ArrayList<>();
        for (int i=0; i<x; i++) {
            mails.add(new Message(
                    1, Date.valueOf("12-10-2020"), "dasfldsajfl;ksajd;lkfjsa dsafjsa sadfj;a"
            ));
        }
        this.isEmpty = false;

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public List<Message> getMails() {
        if (this.isEmpty)
            System.out.println("nothing to show");
        return this.mails;
    }
}
