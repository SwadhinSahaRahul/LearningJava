package Chapter4.L2P12;

import java.util.Scanner;

public class WeightRecommendation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height: ");
        Double height = scanner.nextDouble();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        Height heightCal = new Height();
        Double recommendedWeight = heightCal.calculateRecommendedWeight(height, age);
        System.out.print("Recommended Weight: " + recommendedWeight + " KG");
    }
}
