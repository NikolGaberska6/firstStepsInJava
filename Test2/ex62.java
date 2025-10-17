package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; i <= num2 ; i++) {

            int firstNumber = i / 1000 % 10;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int fourthNumber = i % 10;

            firstNumber = firstNumber;

            if (firstNumber %2 == 0) {
                firstNumber ++;
            } else if (secondNumber %2 == 0) {
                secondNumber ++;
            } else if (thirdNumber % 2 == 0) {
                thirdNumber ++;
            } else if (fourthNumber % 2 == 0) {
                fourthNumber ++;
            }
        }
        System.out.println();
    }
}
