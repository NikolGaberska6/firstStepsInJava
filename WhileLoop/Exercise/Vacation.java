package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeededForHoliday = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int daysForSpendingMoney = 0;
        int allDays = 0;

        while (command.equals("spend")) {
            int money = Integer.parseInt(scanner.nextLine());
            availableMoney -= money;
            daysForSpendingMoney++;
            allDays++;
            if (daysForSpendingMoney == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", allDays);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("save")) {
            int money = Integer.parseInt(scanner.nextLine());
            if (availableMoney <= 0) {
                availableMoney = 0;
            }
            availableMoney += money;
            daysForSpendingMoney -= daysForSpendingMoney;
            allDays++;
            if (availableMoney >= moneyNeededForHoliday) {
                System.out.printf("You saved the money for %d days.", allDays);
            } else {
                availableMoney += money;
                allDays ++;
                System.out.printf("You saved the money for %d days.", allDays);
            }
        }
    }
}
