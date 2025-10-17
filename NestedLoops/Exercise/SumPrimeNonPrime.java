package ProgrammingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int primeNums = 0;
        int nonPrimeNums = 0;
        int prime = 0;
        int nonPrime = 0;


        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            int countNumber = 0;
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 1; i <= number ; i++) {
                if (number % i == 0) {
                    countNumber ++;
                }
            }
            if (countNumber > 2) {
                nonPrimeNums += number;
            } else {
                primeNums += number;
            }

            input = scanner.nextLine();
        }

        prime = primeNums;
        nonPrime = nonPrimeNums;
        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);

    }
}
