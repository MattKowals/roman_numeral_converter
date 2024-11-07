package org.example;

import java.util.Scanner;

public class Prompts {

    public static final Scanner userInput = new Scanner(System.in);


    public String promptForString(String prompt) {
        System.out.println(prompt);
        return userInput.nextLine();
    }

    public int promptForInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String response = userInput.nextLine();
            try {
                return Integer.parseInt(response);
            } catch (NumberFormatException e) {
                if (response.isBlank()) {
                    return -1;
                } else {
                    System.out.println("**Whole Numbers only**");
                }
            }
        }
    }

}
