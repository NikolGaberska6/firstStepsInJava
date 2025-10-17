package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = Math.floor(change * 100);
        double numCoins = 0;

        while (changeInCoins > 0) {

            if (changeInCoins >= 200) {
                numCoins++;
                changeInCoins -= 200;

            } else if (changeInCoins >= 100) {
                numCoins++;
                changeInCoins -= 100;

            } else if (changeInCoins >= 50) {
                numCoins++;
                changeInCoins -= 50;

            } else if (changeInCoins >= 20) {
                numCoins++;
                changeInCoins -= 20;

            } else if (changeInCoins >= 10) {
                    numCoins++;
                    changeInCoins -= 10;

            } else if (changeInCoins >= 5) {
                numCoins++;
                changeInCoins -= 5;

            } else if (changeInCoins >= 2) {
                numCoins++;
                changeInCoins -= 2;

            } else if (changeInCoins >= 1) {
                numCoins++;
                changeInCoins -= 1;
            }
        }
        System.out.printf("%.0f", numCoins);
    }
}