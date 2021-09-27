package chapter2.level2;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        String inputString;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Enter text: ");
        inputString = scanner.next();

        String[] splitString = inputString.split("!");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
    }
}