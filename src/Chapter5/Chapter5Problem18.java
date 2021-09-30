package Chapter5;

import java.util.Scanner;

public class Chapter5Problem18 {
    public static void main(String[] args) {
        double discount = 0;
        String discountAmount = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of bags");
        int num_bags = scan.nextInt();
        double beforeDiscount = num_bags * 5.50;
        if (num_bags >= 25 && num_bags < 50) {
            discount = 0.05;
            discountAmount = "5%";
        } else if (num_bags >= 50 && num_bags < 100) {
            discount = 0.1;
            discountAmount = "10%";
        } else if (num_bags >= 100 && num_bags < 150) {
            discount = 0.15;
            discountAmount = "15%";
        } else if (num_bags >= 150 && num_bags < 200) {
            discount = 0.2;
            discountAmount = "20%";
        } else if (num_bags >= 200 && num_bags < 300) {
            discount = 0.25;
            discountAmount = "25%";
        } else if (num_bags >= 300) {
            discount = 0.3;
            discountAmount = "30%";
        }
        System.out.format("Numbers of Bags Ordered: %d - $ %.2f\n", num_bags, beforeDiscount);
        System.out.println("               Discount:");
        System.out.format("                         %s - $ %.2f\n", discountAmount, beforeDiscount * discount);
        System.out.println("  Your total charge is: $ " + (beforeDiscount - (beforeDiscount * discount)));
    }
}
