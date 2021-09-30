package Chapter6;

import java.util.Scanner;

public class Chapter6Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        while (number > 0) {
            Chapter6Problem7 obj = new Chapter6Problem7();
            boolean isPrime = obj.isPrimeNumber(number);
            if (isPrime) {
                System.out.println("PRIME");
            } else {
                System.out.println("NOT PRIME");
            }
            number = sc.nextInt();
        }
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
