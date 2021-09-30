package Chapter5;

import java.util.Scanner;

public class Chapter5Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter height: ");
        double height = scan.nextDouble();
        double temp = height * 30.48;
        if (temp >= 140 && temp <= 230) {
            System.out.println("Recommended Weight: " + weightCal(age, height));
        } else {
            System.out.println("Height is not between 140cm and 230cm");
        }
    }

    public static double weightCal(int age, double height) {
        return Math.abs((height - 100 + (age / 10)) * 0.90);
    }
}
