package ProgrammingBasics.Exercise.L27;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum1 += number;
        }
        for (int i = 0; i <n; i++) {
            int number2 = Integer.parseInt(scanner.nextLine());
            sum2 += number2;
        }
        if (sum1==sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum2-sum1));
        }
    }
}
