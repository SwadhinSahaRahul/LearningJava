package chapter2.level3;

import galapagos.*;

import java.awt.*;

class MovingTurtle {
    public static void main(String[] arg) {
        Turtle turtle;
        turtle = new Turtle();
        turtle.penColor(Color.BLUE);
        turtle.speed(15);
        turtle.penSize(5);
        turtle.move(100);
        turtle.turn(120);
        turtle.move(100);
        turtle.turn(120);
        turtle.move(100);
    }
}