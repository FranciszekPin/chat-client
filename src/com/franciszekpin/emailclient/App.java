package com.franciszekpin.emailclient;

public class App {
    private UserInteractionManager userInteractionManager;
    private Inbox inbox;
    private Outbox outbox;

    public App() {
        userInteractionManager = new UserInteractionManager();
    }

    void start() {
        while (true) {
            Action action = userInteractionManager.getActionToComplete();
            action.handleAction();
        }
    }
}
