/*
Problem Statement:
    Write a program that inputs temperature in degrees Celsius and prints out the
temperature in degrees Fahrenheit. The formula to convert degrees Celsius
to equivalent degrees Fahrenheit is
Fahrenheit = 1.8 * Celsius + 32
*/

package chapter3.level1;

import java.util.Scanner;

public class CelsiousCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = (5 * (fahrenheit - 32)) / 9;
        System.out.println("Celsius: " + celsius);
    }
}
