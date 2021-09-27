package chapter2.level2;

import javax.swing.*;
import java.util.Scanner;

public class WidthHeightNameWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Enter Window Width: ");
        int width = scanner.nextInt();
        System.out.print("Enter Window Height: ");
        int height = scanner.nextInt();
        System.out.print("Enter Window Title: ");
        String title = scanner.next();

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(width, height);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
