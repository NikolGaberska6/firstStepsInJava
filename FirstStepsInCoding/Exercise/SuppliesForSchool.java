package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {

        public static void main(String[] args) {
            Scanner scannner = new Scanner(System.in);

            //Прочитане на вход
            int countPenPackets = Integer.parseInt(scannner.nextLine());
            int countHighlighters = Integer.parseInt(scannner.nextLine());
            int cleaningAgent = Integer.parseInt(scannner.nextLine());
            int discount = Integer.parseInt(scannner.nextLine());
            //Изчисления
            double priceForPens = countPenPackets * 5.80;
            double priceForHighLighters = countHighlighters * 7.20;
            double priceCleaningAgent = cleaningAgent * 1.20;

            double withoutDiscount = priceForPens + priceForHighLighters + priceCleaningAgent;
            double finalSum = withoutDiscount - (withoutDiscount * (discount/100.0));

            System.out.println(finalSum);



        }
    }
