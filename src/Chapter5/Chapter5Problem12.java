package Chapter5;

import java.util.Scanner;

public class Chapter5Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year " + year + " is Leap Year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year " + year + " is Leap Year.");
        } else {
            System.out.println("The year " + year + " is NOT Leap Year.");
        }
    }
}
