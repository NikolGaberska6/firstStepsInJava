package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForStaying = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine();
        String rating = scanner.nextLine();

        double priceOneNight = 0;
        double fullPrice = 0;
        double priceAllNights = 0;

        switch (destination) {
            case "room for one person":
                priceOneNight = 18;
                priceAllNights = ((daysForStaying - 1) * 18);
                if (daysForStaying < 10) {
                    fullPrice = priceAllNights;
                } else if (daysForStaying > 10 && daysForStaying <= 15) {
                    fullPrice = priceAllNights;
                } else {
                    fullPrice = priceAllNights;
                }
                if (rating.equals("positive")) {
                    fullPrice = fullPrice + fullPrice * 0.25;
                } else if (rating.equals("negative")) {
                    fullPrice = fullPrice - fullPrice * 0.1;
                }
                break;


            case "apartment":
                priceOneNight = 25;
                priceAllNights = ((daysForStaying - 1) * 25);
                if (daysForStaying < 10) {
                    fullPrice = priceAllNights - priceAllNights * 0.3;
                } else if (daysForStaying < 15 && daysForStaying > 10) {
                    fullPrice = priceAllNights - priceAllNights * 0.35;
                } else {
                    fullPrice = priceAllNights - priceAllNights * 0.5;
                }
                if (rating.equals("positive")) {
                    fullPrice = fullPrice + fullPrice * 0.25;
                } else if (rating.equals("negative")) {
                    fullPrice = fullPrice - fullPrice * 0.1;
                }
                break;


            case "president apartment":
                priceOneNight = 35;
                priceAllNights = ((daysForStaying - 1) * 35);
                if (daysForStaying < 10) {
                    fullPrice = priceAllNights - priceAllNights * 0.1;
                } else if (daysForStaying < 15 && daysForStaying > 10) {
                    fullPrice = priceAllNights - priceAllNights * 0.15;
                } else {
                    fullPrice = priceAllNights - priceAllNights * 0.2;
                }
                if (rating.equals("positive")) {
                    fullPrice = fullPrice + fullPrice * 0.25;
                } else if (rating.equals("negative")) {
                    fullPrice = fullPrice - fullPrice * 0.1;
                }
                break;
        }
        System.out.printf("%.2f", fullPrice);
    }
}