package Chapter9;

import java.util.Scanner;

public class L1P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        boolean run = true;
        while (run) {
            System.out.print("Insert a text: ");
            String input = scanner.next();
            if (input.equals("")) {
                run = false;
            } else {
                StringBuffer stringBuffer = new StringBuffer(input);
                System.out.println("Reversed: " + stringBuffer.reverse());
            }
        }
    }
}
