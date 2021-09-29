package Chapter5;
import java.util.Scanner;

public class development_18 {

	public static void main(String[] args) {
		
		double discount = 0;
		String disc_amnt = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of bags");
		int num_bags = scan.nextInt();
		
		double before_disc = num_bags * 5.50;
		
		if (num_bags >= 25 && num_bags < 50)
		{
			discount = 0.05;
			disc_amnt = "5%";
		}
		
		else if (num_bags >= 50 && num_bags < 100)
		{
			discount = 0.1;
			disc_amnt = "10%";
		}
		
		else if (num_bags >= 100 && num_bags < 150)
		{
			discount = 0.15;
			disc_amnt = "15%";
		}
		
		else if (num_bags >= 150 && num_bags < 200)
		{
			discount = 0.2;
			disc_amnt = "20%";
		}
		
		else if (num_bags >= 200 && num_bags < 300)
		{
			discount = 0.25;
			disc_amnt = "25%";
		}
		
		else if (num_bags >= 300)
		{
			discount = 0.3;
			disc_amnt = "30%";
		}
		
		
		System.out.format("Numbers of Bags Ordered: %d - $ %.2f\n", num_bags, before_disc);
		System.out.println("               Discount:");
		System.out.format("                         %s - $ %.2f\n", disc_amnt, before_disc*discount);
		System.out.println("  Your total charge is: $ " + (before_disc - (before_disc*discount)));

	}

}
