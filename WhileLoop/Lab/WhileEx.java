package ProgrammingBasics.WhileLoop.Lab;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysTournir = Integer.parseInt(scanner.nextLine());
        double allMoney = 0;
        int winDays = 0;
        int loseDays = 0;
        int allWins = 0;
        int allLoses = 0;
        double moneyOneDay = 0;


        for (int i = 1; i <= daysTournir; i++) {
            String sport = scanner.nextLine();
            double money = 0;
            int wins = 0;
            int loses = 0;
            while (!sport.equals("Finish")) {
                String command = scanner.nextLine();
                switch (command) {
                    case "win":
                        money += 20;
                        wins ++;
                        break;
                    case "lose":
                        loses ++;
                        break;
                }

                sport = scanner.nextLine();
                allWins = wins;
                allLoses = loses;
            }

            if (allWins > allLoses) {
                money = money + (money * 0.1);
                winDays ++;
              moneyOneDay += money;
            } else {
                allMoney += money;
                loseDays ++;
            }

        }
        if (winDays > loseDays) {
            moneyOneDay = moneyOneDay + (moneyOneDay * 0.2);
            System.out.printf("You won the tournament! Total raised money: %.2f", moneyOneDay);
        } else {
            moneyOneDay += allMoney;
            System.out.printf("You lost the tournament! Total raised money: %.2f", moneyOneDay);
        }






    }
}
