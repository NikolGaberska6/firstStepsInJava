package ProgrammingBasics.Exercise.L27;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (maxNumber < num) {
                maxNumber = num;
            } else if (minNumber > n) {
                minNumber = num;
            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d%n", minNumber);
    }
}
