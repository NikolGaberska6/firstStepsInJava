package ProgrammingBasics.MyExam;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double teresasMoney = Double.parseDouble(scanner.nextLine());
        double moneyForDayFromSale = Double.parseDouble(scanner.nextLine());
        double expenseForAllPeriod = Double.parseDouble(scanner.nextLine());
        double presentPrise = Double.parseDouble(scanner.nextLine());

        double allteresasMoney = 5 * teresasMoney;
        double wonMOney = 5 * moneyForDayFromSale;
        double allSaveMoney = allteresasMoney + wonMOney;
        double moneyWithoutExpense = allSaveMoney - expenseForAllPeriod;

        if (moneyWithoutExpense > presentPrise) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneyWithoutExpense);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", presentPrise - moneyWithoutExpense);
        }





    }
}

