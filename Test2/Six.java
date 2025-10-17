package ProgrammingBasics.Test2;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int evenNums = 0;
        int oddNums = 0;
        int allSum = 0;
        int allNotSum = 0;
        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            int first = i / 1000 % 10;
            int second = i / 100 % 10;
            int third = i / 10 % 10;
            int fourth = i % 10;

            while (firstNum % 2 == 0) {
                firstNum ++;
                firstNum = Integer.parseInt(scanner.nextLine());
            }

            }
        }
    }
