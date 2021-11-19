package exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SemesterDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st Semester:");
        System.out.println("Day: ");
        int firstSemesterDay = scanner.nextInt();
        System.out.println("Month: ");
        int firstSemesterMonth = scanner.nextInt();
        System.out.println("Year: ");
        int firstSemesterYear = scanner.nextInt();

        System.out.println("2nd Semester:");
        System.out.println("Day: ");
        int secondSemesterDay = scanner.nextInt();
        System.out.println("Month: ");
        int secondSemesterMonth = scanner.nextInt();
        System.out.println("Year: ");
        int secondSemesterYear = scanner.nextInt();

        LocalDate firstDate = LocalDate.of(firstSemesterYear, firstSemesterMonth, firstSemesterDay);
        LocalDate secondDate = LocalDate.of(secondSemesterYear, secondSemesterMonth, secondSemesterDay);

        long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days = " + days);
    }
}
