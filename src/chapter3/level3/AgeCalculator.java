package chapter3.level3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Birthday (MM/DD/YYYY): ");
        String birthday = scanner.next();
        String[] split_birthday = birthday.split("/");
        int month = Integer.parseInt(split_birthday[0]);
        int day = Integer.parseInt(split_birthday[1]);
        int year = Integer.parseInt(split_birthday[2]);

        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        long days = ChronoUnit.DAYS.between(birthDate, now);
        System.out.println("Days = " + days);
    }
}
