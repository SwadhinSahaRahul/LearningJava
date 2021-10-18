package CodingTest;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        double A = input.nextDouble();

        System.out.print("Enter the value of B: ");
        double B = input.nextDouble();

        System.out.print("Enter the value of C: ");
        double C = input.nextDouble();

        double X1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
        double X2 = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);

        System.out.println("The roots are " + X1 + " and " + X2);
    }
}