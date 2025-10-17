package ProgrammingBasics.WhileLoop.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            int money = 0;
            while (money < minBudget) {
                double addedMoney = Double.parseDouble(scanner.nextLine());
                money += addedMoney;
                }
            if (money > minBudget) {
                System.out.printf("Going to %s!%n", destination);
            }
            destination = scanner.nextLine();
            }
        }
    }
