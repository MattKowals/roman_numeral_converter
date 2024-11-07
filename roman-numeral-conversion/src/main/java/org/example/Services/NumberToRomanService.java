package org.example.Services;

import org.example.Prompts;

public class NumberToRomanService {

    public Prompts prompt;


    public String convertNumLengthOne(String number) {
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
//        System.out.println(ones);
        return ones;
    }

    public String convertNumLengthTwo(String number) {
        String tens = "";
//        String firstNumber = number.substring(0,1);
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
//        System.out.println(tens);
        return tens;
    }


    public void fullNumberToRomanConversion(String num) {
        String romanNumeral = "";

        int lengthOfNumber = num.length();
        String oneSpot = "";
        String tenSpot = "";
        String hundredSpot = "";
        String thousandSpot = "";

        if (lengthOfNumber == 1) {
            oneSpot = num;
            romanNumeral = convertNumLengthOne(num);
        } else if (lengthOfNumber == 2) {
            oneSpot = num.substring(1);
            tenSpot = num.substring(0,1);
            romanNumeral.concat(convertNumLengthTwo(tenSpot)).concat(convertNumLengthOne(oneSpot));
        }

//        romanNumeral.concat(thousandSpot);
//        romanNumeral.concat(hundredSpot);
//        romanNumeral.concat(convertNumLengthTwo(tenSpot));
//        romanNumeral.concat(convertNumLengthOne(oneSpot));

        System.out.println("Answer = " + romanNumeral);
    }

}
