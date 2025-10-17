package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = x * y;
        double wine = 0.4 * (allGrape/2.5);

        double diff = Math.abs(wine - z);
        double litresPerPerson = diff/numWorkers;
        if (wine >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", diff, litresPerPerson);
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);

        }
    }
}
