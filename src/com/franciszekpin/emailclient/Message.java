package com.franciszekpin.emailclient;

import java.sql.Date;

public class Message {
    private int userId;
    private Date date;
    private String content;

    public Message(int userId, Date date, String content) {
        this.userId = userId;
        this.date = date;
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }
}
