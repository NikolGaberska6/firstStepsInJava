package ProgrammingBasics.Exercise.L27;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum= 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i%2==0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
             if (evenSum == oddSum) {
                 System.out.printf("Yes %nSum = %d", oddSum);
             } else {
            System.out.printf("No %nDiff = %d", Math.abs(evenSum - oddSum));
        }
    }
}



