package ProgrammingBasics.MoreExercise.Urok4;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int neededMoney = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int priceForThings = Integer.parseInt(scanner.nextLine());
            if (priceForThings >= 100) {
                System.out.println("Error in transaction!");
            } else if (priceForThings <= 10) {
                System.out.println("Error in transaction!");
            }



            command = scanner.nextLine();
        }



    }
}
