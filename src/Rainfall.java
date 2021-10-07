import java.util.Scanner;

class Rainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] rainfall = new double[12];
        double
                annualAverage,
                sum,
                difference;
        sum = 0.0;
        for (int i = 0; i < 12; i++) {
            System.out.print("Rainfall for month " + (i + 1) + ": ");
            rainfall[i] = scanner.nextDouble();
            sum += rainfall[i];
        }
        annualAverage = sum / 12.0;
        System.out.format("Annual Average Rainfall:%5.2f\n\n", annualAverage);
        for (int i = 0; i < 12; i++) {
            System.out.format("%3d", i + 1); //month #
            //average rainfall for the month
            System.out.format("%15.2f", rainfall[i]);
            //difference between the monthly and annual averages
            difference = Math.abs(rainfall[i] - annualAverage);
            System.out.format("%15.2f\n", difference);
        }
    }
}