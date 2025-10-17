package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Четем от конзолата
            //Пресмятаме забавянето
            //Пресмятаме времето за което плува
            //Правим проверка

            double currentRecord = Double.parseDouble(scanner.nextLine());
            double distance = Double.parseDouble(scanner.nextLine());
            double timeFor1Meter = Double.parseDouble(scanner.nextLine());

            double delay = Math.floor(distance / 15) * 12.5;
            double result = (distance * timeFor1Meter) + delay;

            if (currentRecord > result) {
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
            } else {
                double diff = result - currentRecord;
                System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
            }

        }
    }

