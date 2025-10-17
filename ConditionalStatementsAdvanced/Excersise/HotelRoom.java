package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numOfNights = Integer.parseInt(scanner.nextLine());

        double priceForStudio = 0;
        double priceForApartment = 0;
        double allPriceS = 0;
        double allPriceA = 0;

        switch (month) {
            case "May":
            case "October":
                priceForStudio = numOfNights * 50;
                if (numOfNights > 7 && numOfNights < 14) {
                    allPriceS = priceForStudio - priceForStudio * 0.05;
                } else if (numOfNights > 14) {
                    allPriceS = priceForStudio - priceForStudio * 0.3;
                }
                priceForApartment = numOfNights * 65;
                if (numOfNights > 14) {
                    allPriceA = priceForApartment - priceForApartment * 0.1;
                } else {
                    allPriceA = priceForApartment;
                }
                break;

            case "June":
            case "September":
                priceForStudio = numOfNights * 75.20;
                if (numOfNights > 14) {
                    allPriceS = priceForStudio - priceForStudio * 0.2;
                } else {
                    allPriceS = priceForStudio;
                }
                priceForApartment = numOfNights * 68.70;
                if (numOfNights > 14) {
                    allPriceA = priceForApartment - priceForApartment * 0.1;
                } else {
                    allPriceA = priceForApartment;
                }
                break;

            case "July":
            case "August":
                priceForStudio = numOfNights * 76;
                priceForApartment = numOfNights * 77;
                allPriceS = priceForStudio;
                if (numOfNights > 14) {
                    allPriceA = priceForApartment - priceForApartment * 0.1;
                } else {
                    allPriceA = priceForApartment;
                }
                break;


        }
        System.out.printf("Apartment: %.2f lv.%n", allPriceA);
        System.out.printf("Studio: %.2f lv.", allPriceS);

    }
}

