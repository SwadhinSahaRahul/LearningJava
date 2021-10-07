package Chapter7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Chapter7Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 9;

        System.out.print("Enter first input: ");
        int i1 = sc.nextInt();

        System.out.print("Enter second input: ");
        int i2 = sc.nextInt();

        System.out.print("Enter third input: ");
        int i3 = sc.nextInt();

        int r1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int r2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int r3 = ThreadLocalRandom.current().nextInt(min, max + 1);

        Chapter7Problem17 obj = new Chapter7Problem17();
        String m1 = obj.checkMatch(r1, r2, r3, i1, 1);
        String m2 = obj.checkMatch(r1, r2, r3, i2, 2);
        String m3 = obj.checkMatch(r1, r2, r3, i3, 3);
        System.out.println(r1 + " " + r2 + " " + r3);
        System.out.println(m1 + " " + m2 + " " + m3);

    }

    public String checkMatch(int r1, int r2, int r3, int input, int position) {
        String message = "";

        if (position == 1) {
            if (r1 == input) {
                message = "Fermi";
            } else if (r2 == input || r3 == input) {
                message = "Pico";
            } else {
                message = "Nano";
            }
        } else if (position == 2) {
            if (r2 == input) {
                message = "Fermi";
            } else if (r1 == input || r3 == input) {
                message = "Pico";
            } else {
                message = "Nano";
            }
        } else if (position == 3) {
            if (r3 == input) {
                message = "Fermi";
            } else if (r1 == input || r2 == input) {
                message = "Pico";
            } else {
                message = "Nano";
            }
        }
        return message;
    }
}
