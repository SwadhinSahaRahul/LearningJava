package Chapter10;

import java.util.Scanner;

public class L1P11 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Size: ");
        n = scanner.nextInt();
        double[] numbers = new double[n];
        double avg;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Input Value: ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        avg = sum / n;
        double deviation;
        double sumOfDiffSqr = 0;
        for (double number : numbers) {
            sumOfDiffSqr += Math.pow(number - avg, 2);
        }
        deviation = Math.sqrt(sumOfDiffSqr / n);
        System.out.format("Standard Deviation: %f", deviation);
    }
}
