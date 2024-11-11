package org.example.Services;

public class RomanToNumberService {

    public int lookForM(String number) {
        int finalValue = 0;

        if (number.contains("M")) {
            // for each M in number
            // look to the left to see if there is a C
            // if no C then thousandSpot += 1000
            // if CM then hundredSpot += 900
            // remove M and/or CM from number
            char[] numberCharArray = number.toCharArray();
            for (int i = 0; i < number.length() - 1; i++) {
                if (numberCharArray[i] == 'M') {
                    if (numberCharArray[i-1] == 'C' && i > 0) {
                        finalValue += 900;
                    } else finalValue += 1000;
                }
            }
        }

        return finalValue;
    }

    public String removeMFromInput(String number) {
        String newNumber = "";
        return newNumber;
    }

    public void romanToNumberConversion(String number) {
        int totalValue = 0;

        char[] numberCharArray = number.toCharArray();

        for (int i = 0; i < number.length(); i++) {
            if (i == 0) {
                if (numberCharArray[0] == 'M') {
                    totalValue += 1000;
                } else if (numberCharArray[0] == 'D') {
                    totalValue += 500;
                } else if (numberCharArray[0] == 'C') {
                    totalValue += 100;
                } else if (numberCharArray[0] == 'L') {
                    totalValue += 50;
                } else if (numberCharArray[0] == 'X') {
                    totalValue += 10;
                } else if (numberCharArray[0] == 'V') {
                    totalValue += 5;
                } else if (numberCharArray[0] == 'I') {
                    totalValue += 1;
                }
            }
            if (i > 0) {
                if (numberCharArray[i] == 'M') {
                    if (numberCharArray[i-1] == 'C') {
                        totalValue += 900;
                    } else totalValue += 1000;
                } else if (numberCharArray[i] == 'D') {
                    if (numberCharArray[i-1] == 'C') {
                        totalValue += 400;
                    } else totalValue += 500;
                } else if (numberCharArray[i] == 'C') {
                    if (numberCharArray[i-1] == 'X') {
                        totalValue += 90;
                    } else totalValue += 100;
                } else if (numberCharArray[i] == 'L') {
                    if (numberCharArray[i-1] == 'X') {
                        totalValue += 40;
                    } else totalValue += 50;
                } else if (numberCharArray[i] == 'X') {
                    if (numberCharArray[i-1] == 'I') {
                        totalValue += 9;
                    } else totalValue += 10;
                } else if (numberCharArray[i] == 'V') {
                    if (numberCharArray[i-1] == 'I') {
                        totalValue += 4;
                    } else totalValue += 5;
                } else if (numberCharArray[i] == 'I') {
                    totalValue += 1;
                }
            }
        }
        System.out.println(totalValue);
    }

}
