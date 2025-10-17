package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double price = 0;


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.3;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.4;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.8;
            }
        } else {
            destination = "Europe";
            place = "Hotel";
            price = budget * 0.9;
            
        }
       System.out.printf("Somewhere in %s%n", destination );
        System.out.printf("%s - %.2f", place, price);
    }
}
