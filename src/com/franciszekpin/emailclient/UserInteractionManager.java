package com.franciszekpin.emailclient;

import java.util.Scanner;

public class UserInteractionManager {
    void getUserInput() {
        String input = readCommand();
        System.out.println(input);
    }

    String readCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
