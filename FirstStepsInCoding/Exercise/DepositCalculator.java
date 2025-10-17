package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            double depositAmount = Double.parseDouble(scanner.nextLine());
            int months = Integer.parseInt(scanner.nextLine());
            double interestRate = Double.parseDouble(scanner.nextLine());
            //Изчисления
            double totalSum = depositAmount + months * (depositAmount * (interestRate/100))/12;

            System.out.println(totalSum);



        }
    }

