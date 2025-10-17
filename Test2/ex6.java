package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2 ; i++) {
            int firstNumber = i / 1000 % 10;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int fourthNumber = i % 10;

            while (firstNumber % 2 == 0) {
                firstNumber++;
                while (secondNumber % 2 == 0) {
                    secondNumber++;
                    while (thirdNumber % 2 == 0) {
                        thirdNumber++;
                        while (fourthNumber % 2 == 0) {
                            fourthNumber++;
                            fourthNumber = Integer.parseInt(scanner.nextLine());
                        }
                        thirdNumber = Integer.parseInt(scanner.nextLine());
                    }
                    secondNumber = Integer.parseInt(scanner.nextLine());
                }
                firstNumber = Integer.parseInt(scanner.nextLine());
                System.out.printf("%d%d%d%d%n", firstNumber, secondNumber, thirdNumber, fourthNumber);
            }
            System.out.printf("%d%d%d%d%n", firstNumber, secondNumber, thirdNumber, fourthNumber);

            //     if (firstNumber % 2 == 0) {
            //       firstNumber ++;
            //  } else {
            //      firstNumber = firstNumber;
            //   }

            //      if (secondNumber % 2 == 0) {
            //         secondNumber ++;
            //     } else {
            //       secondNumber = secondNumber;
            //   }

            //     if (thirdNumber % 2 == 0) {
            //        thirdNumber ++;
            //   } else {
            //     thirdNumber = thirdNumber;
            //    }

            //     if (fourthNumber % 2 == 0) {
            //        fourthNumber ++;
            //      } else {
            //          fourthNumber = fourthNumber;
            //     }


            // boolean chekFirst = firstNumber % 2 != 0;
            //  boolean chekSecond= secondNumber % 2 != 0;
            // boolean chekThird = thirdNumber % 2 != 0;
            // boolean chekFourth = fourthNumber % 2 != 0;

            //  if (chekFirst && chekSecond && chekThird && chekFourth) {
            //    System.out.println(i);
            // }
        }

            }
        }
