package Chapter5;

import java.util.Scanner;

public class RomanConverter {
    static int year;
    static int displayYear;
    static StringBuilder finalResult = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        displayYear = year;
        if (year > 0 && year <= 2013) {
            int[] numberValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] numeralValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            for (int number = 0; number < 13; number++) {
                while (year >= numberValues[number]) {
                    year = year - numberValues[number];
                    finalResult.append(numeralValues[number]);
                }
            }
            System.out.println("The roman value for " + displayYear + " is: " + finalResult.toString());
        } else {
            System.out.println("Value must be in the range 0 - 2013.");
        }
    }
}