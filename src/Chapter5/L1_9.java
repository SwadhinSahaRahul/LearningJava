package Chapter5;

import java.util.Scanner;

public class L1_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a power of 10: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("One");
        } else if (num == 1) {
            System.out.println("ten");
        } else if (num == 2) {
            System.out.println("hundred");
        } else if (num == 3) {
            System.out.println("thousand");
        } else if (num == 4) {
            System.out.println("ten thousand");
        } else if (num == 5) {
            System.out.println("hundred thousand");
        } else if (num == 6) {
            System.out.println("million");
        } else if (num == 7) {
            System.out.println("ten million");
        } else if (num == 8) {
            System.out.println("hundred million");
        } else if (num == 9) {
            System.out.println("billion");
        } else if (num == 12) {
            System.out.println("trillion");
        } else if (num == 15) {
            System.out.println("quadrillion");
        } else if (num == 18) {
            System.out.println("quintillion");
        } else if (num == 21) {
            System.out.println("sextillion");
        } else if (num == 24) {
            System.out.println("septillion");
        } else if (num == 27) {
            System.out.println("octillion");
        } else if (num == 30) {
            System.out.println("nonillion");
        } else if (num == 33) {
            System.out.println("decillion");
        } else if (num == 36) {
            System.out.println("undecillion");
        } else if (num == 39) {
            System.out.println("duodecillion");
        } else if (num == 42) {
            System.out.println("tredecillion");
        } else if (num == 45) {
            System.out.println("quattuordecillion");
        } else if (num == 48) {
            System.out.println("quindecillion");
        } else if (num == 51) {
            System.out.println("sexdecillion");
        } else if (num == 54) {
            System.out.println("septendecillion");
        } else if (num == 57) {
            System.out.println("octodecillion");
        } else if (num == 60) {
            System.out.println("novemdecillion ");
        } else if (num == 63) {
            System.out.println("vigintillion");
        } else if (num == 66) {
            System.out.println("unvigintillion");
        } else if (num == 69) {
            System.out.println("duovigintillion");
        } else if (num == 100) {
            System.out.println("googol");
        } else if (num == 303) {
            System.out.println("centillion");
        } else {
            System.out.println("Invalid power of 10");
        }
    }
}
