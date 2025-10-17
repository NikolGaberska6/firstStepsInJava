package ProgrammingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
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

            int first = i / 100000 % 10;
            int second = i / 10000 % 10;
            int third = i / 1000 % 10;
            int fourth = i / 100 % 10;
            int fifth = i / 10 % 10;
            int sixth = i % 10;

            int allEvenSum = (second + fourth + sixth);
            int allOddSum = (first + third + fifth);

            if (allEvenSum == allOddSum) {
                System.out.printf("%d ", i);
            } else {
                allNotSum ++;
            }
        }
    }
}
