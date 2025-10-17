package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String playerName = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!playerName.equals("END")) {
            int numGoals = Integer.parseInt(scanner.nextLine());
            if (maxGoals < numGoals ) {
                maxGoals = numGoals;
                bestPlayer = playerName;
            }
            if (numGoals >= 10) {
                break;
            }
            playerName = scanner.nextLine();

        }

            System.out.printf("%s is the best player!%n", bestPlayer);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", maxGoals);
        }
        if (maxGoals >= 10) {
        }

    }
}
