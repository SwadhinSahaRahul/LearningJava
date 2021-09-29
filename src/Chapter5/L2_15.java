package Chapter5;
import java.util.*;

public class L2_15 {
	
	public static final int invalid_num = -1;
	private double value;
	
	double a, b, c;
	
	public boolean isValid()
	{
		if (a < 0 || b < 0 || c < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	
	}
	
	
	public double getPerimeter(double aa, double bb, double cc)
	{
		
		a = aa;
		b= bb;
		c = cc;
		
		if(isValid() == true)
		{
			double perimeter = a + b + c;
			
			return perimeter;
		}
		else
		{
			return invalid_num;
		}
		
		
	}
	
	public double getArea(double aa, double bb, double cc)
	{
		a = aa;
		b= bb;
		c = cc;
		
		
		if(isValid() == true)
		{
			double s = (a + b + c) / 2;
			double area = Math.sqrt( (s*(s-a)) * (s*(s-b)) * (s*(s-c)) );
			return area;
		}
		else
		{
			return invalid_num;
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of a (hypotenuse): ");
		double a = scan.nextDouble();
		
		System.out.println("Enter value of b (base): ");
		double b = scan.nextDouble();
		
		System.out.println("Enter value of c (opposite): ");
		double c = scan.nextDouble();
		
		L2_15 obj = new L2_15();
		
		System.out.format("Perimeter of the Triangle is: %.2f \n", obj.getPerimeter(a, b, c));
		System.out.format("Area of the Triangle is: %.2f \n", obj.getArea(a, b, c));

	}

}
