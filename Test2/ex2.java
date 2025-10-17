package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForBaggageOver20kg = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int dayToTrip = Integer.parseInt(scanner.nextLine());
        int numBaggages = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        if (baggageKg < 10) {
            sum = (priceForBaggageOver20kg * 0.2);
        } else if (baggageKg <= 20) {
            sum = priceForBaggageOver20kg/2;
        } else if (baggageKg > 20) {
            sum = priceForBaggageOver20kg;
        }

        if (dayToTrip < 7) {
            sum = sum + (sum * 0.4);
        } else if (dayToTrip >= 7 && dayToTrip <= 30) {
            sum = sum + (sum * 0.15);
        } else if (dayToTrip > 30) {
            sum = sum + (sum * 0.1);
        }

        double finalSum = sum * numBaggages;
        System.out.printf("The total price of bags is: %.2f lv.", finalSum);

    }
}