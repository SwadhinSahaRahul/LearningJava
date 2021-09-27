package chapter2.development;

import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("Enter Your Full Name (first middle last): ");
        String fullName = scanner.next();
        String[] names = fullName.split(" ");
        System.out.println(names[2] + ", " + names[0] + " " + names[1].charAt(0));
    }
}