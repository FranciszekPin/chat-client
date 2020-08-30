package com.franciszekpin.emailclient;

import java.util.Scanner;

public class UserInteractionManager {
    private Inbox inbox;

    UserInteractionManager(Inbox inbox) {
        this.inbox = inbox;
    }

    Action getActionToComplete() {
        System.out.println("Type command: ");
        String input = readInput();
        return interpretCommand(input);
    }

    String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    Action interpretCommand(String command) {
        Action action;
        if (isGetCommand(command)) {
            int number = getNumberOfMessages(command);
            action = new ActionGet(inbox, number);
        }

        else if (isSendCommand(command)) {
            String emailAddress = getEmailAddress(command);
            action = new ActionSend(emailAddress);
        }

        else if (isShowCommand(command)) {
            action = new ActionShow(inbox);
        }

        else action = new WrongCommandAction();

        return action;
    }

    boolean isCommandLengthSufficient(String command, int minimalLength) {
        return command.length() >= minimalLength;
    }

    boolean isGetCommand(String command) {
        return (isCommandLengthSufficient(command, 5))
                && (command.substring(0, 4).equals("get "));
    }

    boolean isSendCommand(String command) {
        return (isCommandLengthSufficient(command, 6))
                && (command.substring(0, 5).equals("send "));
    }

    boolean isShowCommand(String command) {
        return (isCommandLengthSufficient(command, 5))
                && (command.substring(0, 5).equals("show "));
    }

    int getNumberOfMessages(String command) {
        String potentialNumber = command.substring(4);
        int number = 0;
        try {
            number = Integer.parseInt(potentialNumber);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Improper input as number, number set to 10");
            number = 10;
        }
        return number;
    }

    String getEmailAddress(String command) {
        return command.substring(5);
    }
}
