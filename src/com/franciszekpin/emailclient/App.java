package com.franciszekpin.emailclient;

public class App {
    UserInteractionManager userInteractionManager;

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
