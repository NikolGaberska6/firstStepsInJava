package ProgrammingBasics.WhileLoop.Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProducts = 0;
        double allPrice = 0;

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        while (!productName.equals("Stop")) {
            double priceForProduct = Double.parseDouble(scanner.nextLine());

            numProducts++;
            if (numProducts == 3) {
                priceForProduct = priceForProduct / 2;
            }

            budget = Math.abs(budget - priceForProduct);

            if (budget < 0) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", budget);
            }
            allPrice += priceForProduct;

            productName = scanner.nextLine();
        }
        if (budget < 0) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else if (budget < allPrice) {
            System.out.printf("You bought %d products for %.2f leva.", numProducts, allPrice);
        }
    }
}