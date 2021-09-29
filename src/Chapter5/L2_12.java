package Chapter5;
import java.util.Scanner;

public class L2_12 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year to find if it is leap year or not: ");
		int year = scan.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0)
		{
			System.out.println("The year " + year + " is Leap Year.");
		}
		else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
		{
			System.out.println("The year " + year + " is Leap Year.");
		}
		else
		{
			System.out.println("The year " + year + " is NOT Leap Year.");
		}
		
	}

}
