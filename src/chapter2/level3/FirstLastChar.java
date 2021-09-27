package chapter2.level3;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        String inputString;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Enter text: ");
        inputString = scanner.next();

        Integer length = inputString.length();
        System.out.println(length);
        System.out.println(inputString.charAt(0));
        System.out.println(inputString.charAt(length - 1));
    }
}
