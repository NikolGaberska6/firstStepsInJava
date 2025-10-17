package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        switch (command) {
            case "sunny":
                System.out.println("It's warm outside!");
                break;
            }
        if (!command.equals("sunny")) {
            System.out.println("It's cold outside!");
        }
    }
}
