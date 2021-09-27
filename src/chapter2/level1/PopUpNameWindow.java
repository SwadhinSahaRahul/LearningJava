package chapter2.level1; // Assignment 1 Level 1 Problem 18

import javax.swing.*;
import java.util.Scanner;

public class PopUpNameWindow {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("First Name: ");
        firstName = scanner.next();
        System.out.print("Last Name: ");
        lastName = scanner.next();

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300, 200);
        myWindow.setTitle(firstName + " " + lastName);
        myWindow.setVisible(true);
    }
}
