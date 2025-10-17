package ProgrammingBasics.NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            int money = 0;
            while (money < budget) {
                double addedMoney = Double.parseDouble(scanner.nextLine());
                money += addedMoney;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
            }


        }
    }

