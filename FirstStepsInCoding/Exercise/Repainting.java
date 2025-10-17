package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            int neededNylon = Integer.parseInt(scanner.nextLine());
            int neededPaint = Integer.parseInt(scanner.nextLine());
            int neededSeparator = Integer.parseInt(scanner.nextLine());
            int hours = Integer.parseInt(scanner.nextLine());

            //Изчисления
            double priceForNylon = (neededNylon + 2) * 1.50;
            double priceForPaint = (neededPaint + (neededPaint * 0.1)) * 14.50;
            double priceForSeparator = neededSeparator * 5.00;
            double priceForBags = 0.40;
            double finalSumForMaterial = priceForNylon + priceForPaint + priceForSeparator + priceForBags;
            double sumForMastors = (finalSumForMaterial * 0.3) * hours;
            double finalSumForEverything = finalSumForMaterial + sumForMastors;

            //Изход
            System.out.println(finalSumForEverything);

        }
    }

