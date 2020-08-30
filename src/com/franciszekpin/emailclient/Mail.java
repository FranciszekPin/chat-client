package com.franciszekpin.emailclient;

public class Mail {
    private String address;
    private String topic;
    private String content;

    public Mail(String address, String topic, String content) {
        this.address = address;
        this.topic = topic;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public String getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }
}
