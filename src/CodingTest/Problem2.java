package CodingTest;
import  CodingTest.Student;

public class Problem2 {
    public static void main(String[] args) {
        Student[] students = {new Student(), new Student()};
        for (Student student : students) {
            student.input();
            student.computeGPA();
            student.display();
        }
    }
}
