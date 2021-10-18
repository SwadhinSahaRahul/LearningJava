package CodingTest;

import java.util.Scanner;

public class Student {
    String name;
    String ID;
    int[] marks = new int[6];
    double result;

    public static void main(String[] args) {
        Student[] students = {new Student(), new Student()};
        for (Student student : students) {
            student.input();
            student.computeGPA();
            student.display();
        }
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Name: ");
        this.name = scanner.next();
        System.out.print("Student ID: ");
        this.name = scanner.next();
        System.out.println("Enter Marks of 6 subjects.");
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Mark: ");
            this.marks[i] = scanner.nextInt();
        }
    }

    public void computeGPA() {
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 90) {
                sum += 4;
            } else if (marks[i] >= 80 && marks[i] <= 89) {
                sum += 3;
            } else if (marks[i] >= 70 && marks[i] <= 79) {
                sum += 2;
            } else if (marks[i] >= 60 && marks[i] <= 69) {
                sum += 1;
            } else {
                sum += 0;
            }
        }
        result = sum / 6;
    }

    public void display() {
        System.out.println("\nStudent Name: " + name + " ID: " + ID + " GPA: " + result);
    }
}
