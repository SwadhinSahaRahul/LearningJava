/*
Problem Statement:
    Write a program that inputs temperature in degrees Celsius and prints out the
temperature in degrees Fahrenheit. The formula to convert degrees Celsius
to equivalent degrees Fahrenheit is
Fahrenheit = 1.8 * Celsius + 32
*/

package chapter3.level1;

import java.util.Scanner;

public class FahrenheitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
