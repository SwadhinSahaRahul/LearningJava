package Controller;

class Ch3Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius, area, circumference;
        radius = 2.35;
//compute the area and circumference
        area = PI * radius * radius;
        circumference = 2.0 * PI * radius;
        System.out.println("Given Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}