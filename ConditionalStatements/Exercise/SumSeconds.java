package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int firstPlayer = Integer.parseInt(scanner.nextLine());
            int secondPlayer = Integer.parseInt(scanner.nextLine());
            int thirdPlayer = Integer.parseInt(scanner.nextLine());

            int fullTime = firstPlayer + secondPlayer + thirdPlayer;
            int minutes = fullTime/60;
            int secounds = fullTime % 60;

            if (secounds < 10) {
                System.out.printf("%d:0%d",minutes , secounds);
            } else {
                System.out.printf("%d:%d", minutes, secounds);

            }

        }
}
