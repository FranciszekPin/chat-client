package com.franciszekpin.emailclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inbox {
    private List<Mail> mails;
    private boolean isEmpty;

    public Inbox() {
        this.isEmpty = true;
    }

    public void downloadMails(int x) {
        mails = new ArrayList<Mail>();
        for (int i=0; i<x; i++) {
            mails.add(new Mail(
                    "example@company.com",
                    "Some topic",
                    "hahahah co tam u cbbb"
            ));
        }
        this.isEmpty = false;

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public List<Mail> getMails() {
        if (this.isEmpty)
            System.out.println("nothing to show");
        return this.mails;
    }
}