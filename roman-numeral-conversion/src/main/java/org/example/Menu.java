package org.example;

import java.util.Scanner;

public class Menu {

    public static final Scanner userInput = new Scanner(System.in);

    public String showMainMenu() {
        System.out.println("Number Converter - ");
        System.out.println("Roman Numerals and Arabic numerals");
        System.out.println();

        System.out.println("1. Convert a Roman Numeral");
        System.out.println("2. Convert to a Roman Numeral");
        System.out.println("3. End Program");
        System.out.println("--> ");

        return userInput.nextLine();
    }


}
