package org.example;

import org.example.Services.NumberToRomanService;
import org.example.Services.RomanToNumberService;

public class RomanNumeralConversionApp {

    private Prompts prompt;
    private Menu menu;
    private RomanToNumberService romanToNumberService;
    private NumberToRomanService numberToRomanService;


    public RomanNumeralConversionApp() {
        this.menu = new Menu();
        this.prompt = new Prompts();
        this.romanToNumberService = new RomanToNumberService();
        this.numberToRomanService = new NumberToRomanService();
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
                String newSelection = menu.showRomanToNumberMenu();
            } else if (userSelection.equals("2")) {
                numberToRomanService.fullNumberToRomanConversion(prompt.promptForString("Enter number"));
//                String newSelection = menu.showNumberToRomanMenu();
            } else if (userSelection.equals("3")) {
                menu.goodbyeMessage();
                break;
            } else if (userSelection.equals("4")) {
                numberToRomanService.fullNumberToRomanConversion(prompt.promptForString("Enter number"));
            }

        }

    }

}