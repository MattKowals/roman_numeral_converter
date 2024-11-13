package org.example;

public class Rules {

    public void displayRomanNumeralSymbols() {
        System.out.printf("%-15s | %-10s%n", "Roman Numeral", "Number Value");
        System.out.printf("%-15s | %-10s%n", "I", "1");
        System.out.printf("%-15s | %-10s%n", "V", "5");
        System.out.printf("%-15s | %-10s%n", "X", "10");
        System.out.printf("%-15s | %-10s%n", "L", "50");
        System.out.printf("%-15s | %-10s%n", "C", "100");
        System.out.printf("%-15s | %-10s%n", "D", "500");
        System.out.printf("%-15s | %-10s%n", "M", "1000");
    }

    public void displayRulesOfRomanNumerals() {
        System.out.println();
        System.out.println("Rules for Roman Numerals:");
        System.out.println("1. A symbol placed after one of equal or greater value gets added");
        System.out.println("    ex. VII -> The first two I's follow either an I or a V, which are equal or greater, so VII = 7");
        System.out.println("2. A symbol placed before one of greater value gets subtracted");
        System.out.println("    ex. IX -> The I comes before the X so it is subtracted. X is 10, I is 1, so IX = 10-1 = 9");
        System.out.println("3. A symbol placed between two larger values is subtracted from the numeral on it's right");
        System.out.println("    ex. CXC -> The X, which is 10, is between two C's, which is 100, so 10 is subtracted from the second C. CXC = 100 + (100-10) = 190");
        System.out.println("4. No more than three identical symbols can be used in a row");
        System.out.println("    ex. XXXX -> This is invalid for 40. To write 40, use XL");
        System.out.println("5. V, L, and D cannot be repeated");
        System.out.println("    ex. VV, LL, and DD are all invalid and all have a symbol equal to them. VV is X, LL is C, DD is M");
        System.out.println("6. Only I, X, and C can be used for subtraction");
        System.out.println("    ex. LM -> LM is an invalid way to write 950. The correct way is CML");
        System.out.println("7. There are only six combinations for subtraction: IV = 4, IX = 9, XL = 40, XC = 90, CD = 400, CM = 900");
        System.out.println("    ex. XM -> This is invalid for 990. To write 990, write CMXC");
        System.out.println("8. There is no numeral for 0");
        System.out.println("9. The largest valid Roman Numeral is MMMCMXCIX which is 3999");
    }

}
