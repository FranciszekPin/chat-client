package com.franciszekpin.emailclient;

import java.util.Scanner;

public class UserInteractionManager {
    void interactWithUser() {
        System.out.println("Type command: ");
        String input = readInput();
        interpretCommand(input);
    }

    String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    void interpretCommand(String command) {
        if (isGetCommand(command)) {
            int number = getNumberOfMessages(command);
            System.out.println("Get " + number + " messages");
        }
        
        if (isSendCommand(command)) {
            String emailAddress = getEmailAddress(command);
            System.out.println("Send on " + emailAddress + " address");
        }
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
