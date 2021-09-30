package Chapter6;

import java.util.Scanner;

public class Chapter6Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        if (number < 3) {
            System.out.println("Please enter number greater than 2");
        } else {
            for (int i = 2; i <= number; i++) {
                Chapter6Problem13 obj = new Chapter6Problem13();
                boolean isPrime = obj.isPrimeNumber(i);
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time took " + (endTime - startTime) + " milliseconds");
    }

    public boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("1 is either prime nor real number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}