package org.example;

import org.example.Services.NumberToRomanService;
import org.example.Services.RomanToNumberService;

public class RomanNumeralConversionApp {

    private Prompts prompt;
    private Menu menu;
    private RomanToNumberService romanToNumberService;
    private NumberToRomanService numberToRomanService;
    private Rules rules;


    public RomanNumeralConversionApp() {
        this.menu = new Menu();
        this.prompt = new Prompts();
        this.romanToNumberService = new RomanToNumberService();
        this.numberToRomanService = new NumberToRomanService();
        this.rules = new Rules();
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
                romanToNumberService.romanToNumberConversion(prompt.promptForString("Enter Roman Numeral"));
            } else if (userSelection.equals("2")) {
                String number = prompt.promptForString("Enter number");
                if (numberToRomanService.verifyNumberIsValid(number) == true) {
                    numberToRomanService.fullNumberToRomanConversion(number);
                } else System.out.println("Invalid input");
            } else if (userSelection.equals("3")) {
                rules.displayRomanNumeralSymbols();
            } else if (userSelection.equals("4")) {
                rules.displayRulesOfRomanNumerals();
            } else if (userSelection.equals("5")) {
                menu.goodbyeMessage();
                break;
            }
        }
    }
}