package Chapter5;
import java.util.Scanner;

public class L1_10 {
	int age;
	double height;
	
	public double rec_weight(int age, double height)
	{
		int s_age = age;
		double s_height = height;
		
		double weight = Math.abs((s_height - 100 + s_age / 10) * 0.90);
		
		return weight;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		L1_10 obj = new L1_10();
		
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter height: ");
		double height = scan.nextDouble();
		
		double temp = height * 30.48;
		
		if (temp >= 140 && temp <= 230)
		{
			System.out.println("Recommended Weight: " + obj.rec_weight(age, height));
		}
		else
		{
			System.out.println("Height is not between 140cm and 230cm");
		}
		
	}

}
