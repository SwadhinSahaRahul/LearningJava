package Chapter9;

import java.util.Scanner;

public class L2P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        int count = 0;
        while (true) {
            System.out.print("Enter string: ");
            String input = scanner.next();
            if (input.equals("")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    count++;
                }
            }
            System.out.println("Uppercase count: " + count);
        }
    }
}
