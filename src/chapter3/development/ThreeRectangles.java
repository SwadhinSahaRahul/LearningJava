package chapter3.development;

import galapagos.Turtle;

import java.awt.*;
import java.util.Scanner;

public class ThreeRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter Height: ");
        double height = scanner.nextDouble();

        Turtle turtle;
        turtle = new Turtle();
        turtle.penColor(Color.BLUE);
        turtle.speed(150);
        turtle.penSize(5);


        drawRectangle(turtle, width, height);
        drawRectangle(turtle, width + width * .4, height + height * .4);
        drawRectangle(turtle, width + width * .8, height + height * .8);
    }

    public static void drawRectangle(Turtle turtle, double width, double height) {
        turtle.move(width);
        turtle.turn(90);
        turtle.move(height);
        turtle.turn(90);
        turtle.move(width);
        turtle.turn(90);
        turtle.move(height);
        turtle.turn(90);
    }
}