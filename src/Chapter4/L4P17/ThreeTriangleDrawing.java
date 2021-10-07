package Chapter4.L4P17;

import galapagos.Turtle;
import galapagos.TurtleDrawingWindow;

import java.awt.*;

public class ThreeTriangleDrawing {
    public static void main(String[] args) {
        TurtleDrawingWindow canvas = new TurtleDrawingWindow();

        Turtle winky, pinky, tinky;

        winky = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        pinky = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        tinky = new Turtle(Turtle.NO_DEFAULT_WINDOW);

        winky.penColor(Color.GREEN);
        pinky.penColor(Color.PINK);
        tinky.penColor(Color.BLUE);

        canvas.add(winky);
        canvas.add(pinky);
        canvas.add(tinky);

        int base = 100;
        int left = 100;
        int right = 100;
        int angle = 120;
        double perimeter = (base + left + right) / 2.0;
        double area = Math.sqrt(perimeter * (perimeter - base) * (perimeter - left) * (perimeter - right));
        double height = 2 * area / base;

        canvas.setSize(1000, 700);
        canvas.setResizable(true);
        canvas.setVisible(true);

        winky.pause();
        pinky.pause();
        tinky.pause();

        winky.move(base);
        winky.turn(angle);
        winky.move(left);
        winky.turn(angle);
        winky.move(right);

        pinky.jumpTo(base, 0);
        pinky.move(base);
        pinky.turn(angle);
        pinky.move(left);
        pinky.turn(angle);
        pinky.move(right);

        tinky.jumpTo(base / 2.0, height);
        tinky.move(base);
        tinky.turn(angle);
        tinky.move(left);
        tinky.turn(angle);
        tinky.move(right);

        winky.start();
        pinky.start();
        tinky.start();
    }
}
