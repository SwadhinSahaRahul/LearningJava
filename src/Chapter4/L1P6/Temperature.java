package Chapter4.L1P6;

import java.text.DecimalFormat;
import java.util.Scanner;

class Temperature {
    public static final DecimalFormat DF = new DecimalFormat("0.00");
    private double temperature;

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        temperature.setFahrenheit(fahrenheit);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Temperature in Celsius: " + df.format(temperature.toCelsius()));
    }

    public double toFahrenheit() {
        return temperature;
    }

    public double toCelsius() {
        return (temperature - 32) * 5 / 9;
    }

    public void setFahrenheit(Double fahrenheit) {
        temperature = fahrenheit;
    }

    public void setCelsius(Double celsius) {
        temperature = celsius * 9 / 5 + 32;
    }
}