package exam;

public class Circle {
    final double PI = 3.14;
    public double radius;

    public Circle() {
    }

    public static void main(String[] args) {
        Circle innerCircle = new Circle();
        Circle outerCircle = new Circle();
        innerCircle.setRadius(5);
        outerCircle.setRadius(10);
        double areaDifference = outerCircle.calculateArea() - innerCircle.calculateArea();
        System.out.println("Shaded Area: " + areaDifference);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }

    public double calculateCircumference() {
        return 2 * PI * this.radius;
    }
}
