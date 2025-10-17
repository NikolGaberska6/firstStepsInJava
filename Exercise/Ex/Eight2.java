package ProgrammingBasics.Exercise.Ex;

import java.util.Scanner;

public class Eight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < smallest)
                smallest = number;
            if (number > biggest)
                biggest = number;


        }
        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d%n", smallest);




    }
}
