package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numRibars = Integer.parseInt(scanner.nextLine());


        switch (season) {
            case "Spring":
                double fullPrice = 3000;
                if(numRibars <= 6) {
                    fullPrice = fullPrice - (fullPrice * 0.1);
                } else if (numRibars > 7 && numRibars <= 11) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                } else if (numRibars > 12) {
                    fullPrice = fullPrice - (fullPrice * 0.25);
                }
                if (numRibars %2 == 0) {
                    fullPrice = fullPrice - (fullPrice * 0.05);
                }
                if (budget >= fullPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - fullPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", fullPrice - budget);
                }
                break;

            case "Summer":
                fullPrice = 4200;
                if(numRibars <= 6) {
                    fullPrice = fullPrice - (fullPrice * 0.1);
                } else if (numRibars > 7 && numRibars <= 11) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                } else if (numRibars > 12) {
                    fullPrice = fullPrice - (fullPrice * 0.25);
                }
                if (numRibars %2 == 0) {
                    fullPrice = fullPrice - (fullPrice * 0.05);
                }
                if (budget >= fullPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - fullPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", fullPrice - budget);
                }
                break;

            case "Autumn":
                fullPrice = 4200;
                if(numRibars <= 6) {
                    fullPrice = fullPrice - (fullPrice * 0.1);
                } else if (numRibars > 7 && numRibars <= 11) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                } else if (numRibars > 12) {
                    fullPrice = fullPrice - (fullPrice * 0.25);
                }
                if (budget >= fullPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - fullPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", fullPrice - budget);
                }
                break;

            case "Winter":
                fullPrice = 2600;
                if(numRibars <= 6) {
                    fullPrice = fullPrice - (fullPrice * 0.1);
                } else if (numRibars > 7 && numRibars <= 11) {
                    fullPrice = fullPrice - (fullPrice * 0.15);
                } else if (numRibars > 12) {
                    fullPrice = fullPrice - (fullPrice * 0.25);
                }
                if (numRibars %2 == 0) {
                    fullPrice = fullPrice - (fullPrice * 0.05);
                }
                if (budget >= fullPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - fullPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", fullPrice - budget);
                }
                break;

        }





    }
}
