package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numClients = Integer.parseInt(scanner.nextLine());
        double avarage = 0;

        for (int i = 1; i <= numClients; i++) {
            String command = scanner.nextLine();
            double allSum = 0;
            int numBasket = 0;
            int numWreath = 0;
            int numCB = 0;
            double allPurchases = 0;
            while (!command.equals("Finish")) {
                switch (command) {
                    case "basket":
                        allSum += 1.50;
                        numBasket++;
                        break;
                    case "wreath":
                        allSum += 3.80;
                        numWreath ++;
                        break;
                    case "chocolate bunny":
                        allSum += 7;
                        numCB ++;
                        break;

                }

                allPurchases = numBasket + numWreath + numCB;

                command = scanner.nextLine();

            }

            if (allPurchases % 2 == 0) {
                allSum = allSum - (allSum * 0.2);
            } else {
                allSum = allSum;
            }

            double avarageBill = allSum/numClients;
            avarage += avarageBill;


            System.out.printf("You purchased %.0f items for %.2f leva.%n", allPurchases, allSum);
        }
        System.out.printf("Average bill per client is: %.2f leva.%n", avarage);
    }
}
