package ProgrammingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;

        for (int i = 1111; i <= 9999; i++) {
            int firstNum = i / 1000 % 10;
            int secondNum = i / 100 % 10;
            int thirdNum = i / 10 % 10;
            int fourthNum = i % 10;

            boolean chekFirst = n % firstNum == 0;
            boolean chekSecond= secondNum != 0 && n % secondNum == 0;
            boolean chekThird = thirdNum != 0 && n % thirdNum == 0;
            boolean chekFourth = fourthNum != 0 && n % fourthNum == 0;


            if (chekFirst && chekSecond && chekThird && chekFourth) {
                System.out.printf("%d ", i);
            }
        }
    }
}
