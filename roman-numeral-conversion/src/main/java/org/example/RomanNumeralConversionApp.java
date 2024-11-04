package org.example;

import org.example.Services.ArabicToRomanService;
import org.example.Services.RomanToArabicService;

import java.util.Scanner;

public class RomanNumeralConversionApp {

    private Prompts prompt;
    private Menu menu;
    private RomanToArabicService romanToArabicService;
    private ArabicToRomanService arabicToRomanService;


    public RomanNumeralConversionApp() {
        this.menu = new Menu();
        this.prompt = new Prompts();
        this.romanToArabicService = new RomanToArabicService();
        this.arabicToRomanService = new ArabicToRomanService();
    }


    public static void main(String[] args) {

        RomanNumeralConversionApp app = new RomanNumeralConversionApp();
        app.run();

    }

    public void run() {

        while (true) {

            String userSelection = menu.showMainMenu();
            if (userSelection.equals("1")) {
                // Convert Roman numeral to number
                String newSelection = menu.showRomanToArabicMenu();
            } else if (userSelection.equals("2")) {
                // Convert Number to Roman numeral
                String newSelection = menu.showArabicToRomanMenu();
            } else if (userSelection.equals("3")) {
                System.out.println("Goodbye!");
                break;
            }

        }

    }

}