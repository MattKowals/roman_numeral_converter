package org.example;

import java.util.Scanner;

public class Menu {

    public static final Scanner userInput = new Scanner(System.in);

    public String showMainMenu() {
        System.out.println();
        System.out.println("Roman Numerals Converter");
        System.out.println();

        System.out.println("1. Convert a Roman Numeral to a number");
        System.out.println("2. Convert a number to a Roman Numeral");
        System.out.println("3. What are the Roman Numeral symbols?");
        System.out.println("4. What are the rules of Roman Numerals?");
        System.out.println("5. End Program");
        System.out.println("--> ");

        return userInput.nextLine();
    }

    public String showRomanToNumberMenu() {
        System.out.println("1. Enter a Roman Numeral");
        System.out.println("2. Return to Main Menu");

        return userInput.nextLine();
    }

    public String showNumberToRomanMenu() {
        System.out.println("1. Enter a Number");
        System.out.println("2. Return to Main Menu");

        return userInput.nextLine();
    }

    public void goodbyeMessage() {
        System.out.println("Goodbye!");
    }

}
