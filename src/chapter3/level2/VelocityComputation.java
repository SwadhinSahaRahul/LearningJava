package chapter3.level2;

public class VelocityComputation {
    public static void main(String[] args) {
        double gravity = 6.67 / Math.pow(10, 11);
        double mass = 5.98 * Math.pow(10, 24);
        double radius = 6.98 * Math.pow(10, 6);

        double velocity = Math.sqrt((gravity * mass) / radius);

        System.out.println("Universal Gravitational Constant: " + gravity);
        System.out.println("Mass of Earth:" + mass);
        System.out.println("Distance From Earth:" + radius);
        System.out.println("Velocity:" + velocity);
    }
}
