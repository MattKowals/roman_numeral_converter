package org.example.Services;

import org.example.Prompts;

public class NumberToRomanService {

    public Prompts prompt;


    public String convertNumOnesSpot(String number) {
        String ones = "";
        if (number.equals("1")) {
            ones += "I";
        } else if (number.equals("2")) {
            ones += "II";
        } else if (number.equals("3")) {
            ones += "III";
        } else if (number.equals("4")) {
            ones += "IV";
        } else if (number.equals("5")) {
            ones += "V";
        } else if (number.equals("6")) {
            ones += "VI";
        } else if (number.equals("7")) {
            ones += "VII";
        } else if (number.equals("8")) {
            ones += "VIII";
        } else if (number.equals("9")) {
            ones += "IX";
        }
        return ones;
    }

    public String convertNumTensSpot(String number) {
        String tens = "";
        if (number.equals("1")) {
            tens = "X";
        } else if (number.equals("2")) {
            tens = "XX";
        } else if (number.equals("3")) {
            tens = "XXX";
        } else if (number.equals("4")) {
            tens = "XL";
        } else if (number.equals("5")) {
            tens = "L";
        } else if (number.equals("6")) {
            tens = "LX";
        } else if (number.equals("7")) {
            tens = "LXX";
        } else if (number.equals("8")) {
            tens = "LXXX";
        } else if (number.equals("9")) {
            tens = "XC";
        }
        return tens;
    }

    public String convertNumHundredsSpot(String number) {
        String hundreds = "";
        if (number.equals("1")) {
            hundreds = "C";
        } else if (number.equals("2")) {
            hundreds = "CC";
        } else if (number.equals("3")) {
            hundreds = "CCC";
        } else if (number.equals("4")) {
            hundreds = "CD";
        } else if (number.equals("5")) {
            hundreds = "D";
        } else if (number.equals("6")) {
            hundreds = "CC";
        } else if (number.equals("7")) {
            hundreds = "DCC";
        } else if (number.equals("8")) {
            hundreds = "DCCC";
        } else if (number.equals("9")) {
            hundreds = "CM";
        }
        return hundreds;
    }

    public String convertNumThousandsSpot(String number) {
        String thousands = "";
        if (number.equals("1")) {
            thousands = "M";
        } else if (number.equals("2")) {
            thousands = "MM";
        } else if (number.equals("3")) {
            thousands = "MMM";
        }
        return thousands;
    }

    public void fullNumberToRomanConversion(String num) {
        String romanNumeral = "";

        int lengthOfNumber = num.length();
        String oneSpot = "";
        String tenSpot = "";
        String hundredSpot = "";
        String thousandSpot = "";

        if (lengthOfNumber == 1) {
            String newOnes = convertNumOnesSpot(num);
            romanNumeral = newOnes;
        } else if (lengthOfNumber == 2) {
            oneSpot = num.substring(1);
            tenSpot = num.substring(0,1);
            String newOnes = convertNumOnesSpot(oneSpot);
            String newTens = convertNumTensSpot(tenSpot);
            romanNumeral = newTens + newOnes;
        } else if (lengthOfNumber == 3) {
            oneSpot = num.substring(2);
            tenSpot = num.substring(1,2);
            hundredSpot = num.substring(0,1);
            String newOnes = convertNumOnesSpot(oneSpot);
            String newTens = convertNumTensSpot(tenSpot);
            String newHundreds = convertNumHundredsSpot(hundredSpot);
            romanNumeral = newHundreds + newTens + newOnes;
        } else if (lengthOfNumber == 4) {
            oneSpot = num.substring(3);
            tenSpot = num.substring(2,3);
            hundredSpot = num.substring(1,2);
            thousandSpot = num.substring(0,1);
            String newOnes = convertNumOnesSpot(oneSpot);
            String newTens = convertNumTensSpot(tenSpot);
            String newHundreds = convertNumHundredsSpot(hundredSpot);
            String newThousands = convertNumThousandsSpot(thousandSpot);
            romanNumeral = newThousands + newHundreds + newTens + newOnes;
        }
        System.out.println("Answer = " + romanNumeral);
    }

}
