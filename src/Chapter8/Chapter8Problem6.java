package Chapter8;

import java.util.Scanner;

public class Chapter8Problem6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");

        try {
            int age = scanner.nextInt();
            if (age < 0) {
                throw new Exception("Illegal value: negative age is invalid.");
            } else {
                System.out.println("Eligible !!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
