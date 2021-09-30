package Chapter5;

import java.util.Scanner;

public class Chapter5Problem15 {
    public static final int invalid_num = -1;
    double a, b, c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a (hypotenuse): ");
        double a = scan.nextDouble();
        System.out.println("Enter value of b (base): ");
        double b = scan.nextDouble();
        System.out.println("Enter value of c (opposite): ");
        double c = scan.nextDouble();
        Chapter5Problem15 obj = new Chapter5Problem15();
        System.out.format("Perimeter of the Triangle is: %.2f \n", obj.getPerimeter(a, b, c));
        System.out.format("Area of the Triangle is: %.2f \n", obj.getArea(a, b, c));
    }
    public boolean isValid() {
        return !(a < 0) && !(b < 0) && !(c < 0);
    }
    public double getPerimeter(double a, double b, double c) {
        if (isValid()) {
            return a + b + c;
        } else {
            return invalid_num;
        }
    }
    public double getArea(double a, double b, double c) {
        if (isValid()) {
            double s = (a + b + c) / 2;
            return Math.sqrt((s * (s - a)) * (s * (s - b)) * (s * (s - c)));
        } else {
            return invalid_num;
        }
    }
}
