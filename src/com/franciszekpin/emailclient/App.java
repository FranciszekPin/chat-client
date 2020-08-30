package com.franciszekpin.emailclient;

public class App {
    UserInteractionManager userInteractionManager;
    Inbox inbox;

    public App() {
        inbox = new Inbox();
        userInteractionManager = new UserInteractionManager(inbox);
    }

    void start() {
        while (true) {
            Action action = userInteractionManager.getActionToComplete();
            action.handleAction();
        }
    }
}
