package ProgrammingBasics.MoreExercise.Urok4;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int bottlesForward = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double preparat = bottlesForward * 750;
        double dishes = 0;
        double numDishes = 0;
        double countDishes = 0;
        double sumOfAllDishes = 0;
        double countPot = 0;
        double sumOfAllPot = 0;
        double sumsD = 0;
        double sumsP = 0;

        while (!command.equals("End")) {
            int numDisheshForCleaning = Integer.parseInt(command);
            numDishes++;
            if (numDishes == 3 || numDishes == 6) {
                dishes = preparat - (numDisheshForCleaning * 15);
                preparat = dishes;
                countPot++;
                sumOfAllPot += numDisheshForCleaning;
            } else {
                dishes = preparat - (numDisheshForCleaning * 5);
                preparat = dishes;
                countDishes++;
                sumOfAllDishes += numDisheshForCleaning;
                if (preparat < 0) {
                    System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(dishes - bottlesForward) - 1);
                }
            }

            command = scanner.nextLine();
        }
        sumsD = sumOfAllDishes;
        sumsP = sumOfAllPot;


        if (preparat < 0) {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(dishes - bottlesForward) - 1);
        } else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%.0f dishes and %.0f pots were washed.%n", sumsD, sumsP);
            System.out.printf("Leftover detergent %.0f ml.", dishes);

        }
    }
}
