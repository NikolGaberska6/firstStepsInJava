package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double degrees = Double.parseDouble(scanner.nextLine());

        if ( degrees <= 11.9 && degrees >= 5.00) {
            System.out.println("Cold");
        } else if ( degrees <= 14.09 && degrees >= 12.00) {
            System.out.println("Cool");
        } else if ( degrees <= 20.00 && degrees >= 15.00) {
            System.out.println("Mild");
        } else if ( degrees <= 25.9 && degrees >= 20.01) {
            System.out.println("Warm");
        } else if ( degrees <= 35.00 && degrees >= 26.00) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
