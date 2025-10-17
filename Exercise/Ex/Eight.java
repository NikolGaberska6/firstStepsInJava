package ProgrammingBasics.Exercise.Ex;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < minNumber)
                number = minNumber;
            if (number > maxNumber)
                number = maxNumber;
        }
        System.out.printf("Max number: %d", maxNumber);
        System.out.printf("Min number: %d", minNumber);
        }



    }
