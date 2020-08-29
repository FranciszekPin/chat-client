package com.franciszekpin.emailclient;

public class WrongCommandAction extends Action {
    @Override
    public void handleAction() {
        System.out.println("Wrong command\n");
    }
}
