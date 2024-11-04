package org.example;

import org.example.Services.ArabicToRomanService;
import org.example.Services.RomanToArabicService;

import java.util.Scanner;

public class RomanNumeralConversionApp {

    private Prompts prompt;
    private Menu menu;
    private RomanToArabicService romanToArabicService;
    private ArabicToRomanService arabicToRomanService;

    public static final Scanner userInput = new Scanner(System.in);



    public static void main(String[] args) {

    }

    public void run() {

        while (true) {

            String userSelection = menu.showMainMenu();
            if (userSelection.equals("1")) {
                // Convert Roman numeral to number
            } else if (userSelection.equals("2")) {
                // Convert Number to Roman numeral
            } else if (userSelection.equals("3")) {
                System.out.println("Goodbye!");
                break;
            }

        }

    }

}