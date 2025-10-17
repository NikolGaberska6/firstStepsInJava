package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (typeFlowers) {
            case "Roses":
                price = numFlowers * 5;
                if (numFlowers > 80) {
                    price = price - (price * 0.1);
                }
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
                break;

            case "Dahlias":
                price = numFlowers * 3.80;
                if (numFlowers > 90) {
                    price = price - (price * 0.15);
                }
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
                break;

            case "Tulips":
                price = numFlowers * 2.80;
                if (numFlowers > 80) {
                    price = price - (price * 0.15);
                }
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
                break;

            case "Narcissus":
                price = numFlowers * 3.00;
                if (numFlowers < 120) {
                    price = price + (price * 0.15);
                }
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
                break;

            case "Gladiolus":
                price = numFlowers * 2.50;
                if (numFlowers < 80) {
                    price = price + (price * 0.2);
                }
                if (budget >= price) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);
                } else {
                    System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
                }
                break;


        }
    }
}
