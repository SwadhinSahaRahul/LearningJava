package Chapter9;

import java.util.Scanner;

public class L1P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("Insert a char: ");
            String input = scanner.next();
            if (input.length() > 1) {
                System.out.println("Not a valid input.");
            } else {
                char c = input.charAt(0);
                System.out.format("ASCII : %d \n", (int) c);
                if (c == '@') {
                    run = false;
                }
            }
        }
    }
}
