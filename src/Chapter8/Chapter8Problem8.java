package Chapter8;

import java.util.Scanner;

public class Chapter8Problem8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String room = "";
        String password = "";

        try {
            while (!name.equals("Admin") && !room.equals("X123") && !password.equals("$maTrix%TwO$")) {
                System.out.print("Enter name: ");
                name = sc.next();

                System.out.print("Enter room: ");
                room = sc.next();

                System.out.print("Enter password: ");
                password = sc.next();
            }
        } catch (Exception e) {
            System.out.println("Program terminated!");
        }
    }
}
