package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForHoliday = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numDolls= Integer.parseInt(scanner.nextLine());
        double numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTractors = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        double finalPrice = 0;

        double allNumToys = numPuzzles + numDolls + numBears +numMinions + numTractors;

        double priceForPuzzles = numPuzzles * 2.60;
        double priceForDolls = numDolls * 3;
        double priceForBears = (numBears * 4.10);
        double priceForMinions = (numMinions * 8.20);
        double priceForTractors = numTractors * 2;

        double allPriceToys = priceForPuzzles + priceForDolls + priceForBears + priceForMinions +priceForTractors;

        if (allNumToys >= 50) {
         discount = allPriceToys * 0.25;
         finalPrice = allPriceToys - discount;
        } else {
            finalPrice = allPriceToys;
        }

        double sale = finalPrice * 0.1;
        double finalEndPrice = finalPrice - sale;

        if (finalEndPrice  > priceForHoliday) {
            System.out.printf("Yes! %.2f lv left.", finalEndPrice - priceForHoliday);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceForHoliday - finalEndPrice);
        }





    }
}
