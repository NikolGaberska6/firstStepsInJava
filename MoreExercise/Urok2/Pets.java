package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numDays = Integer.parseInt(scanner.nextLine());
        int leftFoodInKg = Integer.parseInt(scanner.nextLine());
        double dayFoodForDog = Double.parseDouble(scanner.nextLine());
        double dayFoodForCat = Double.parseDouble(scanner.nextLine());
        double dayFoodForTurtle = Double.parseDouble(scanner.nextLine());

        double neededFoodForDog = numDays * dayFoodForDog;
        double neededFoodForCat = numDays * dayFoodForCat;
        double neededFoodForTurtle = numDays * dayFoodForTurtle/1000;

        double allFood = neededFoodForCat + neededFoodForDog + neededFoodForTurtle;
        double diff = Math.abs(leftFoodInKg - allFood);



        if (leftFoodInKg >= allFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else if (leftFoodInKg <= allFood) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
