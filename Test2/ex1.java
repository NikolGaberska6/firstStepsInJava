package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAvioCompany = scanner.nextLine();
        int numBiletsForAdults = Integer.parseInt(scanner.nextLine());
        int numBiletsForKids = Integer.parseInt(scanner.nextLine());
        double priceForAdultsBilet = Double.parseDouble(scanner.nextLine());
        double priceServiseFee = Double.parseDouble(scanner.nextLine());

        double priceForKIdsBilet = priceForAdultsBilet - (priceForAdultsBilet * 0.7);
        double priceAdultBiletWithService = priceForAdultsBilet + priceServiseFee;
        double priceKidsBiletWithService = priceForKIdsBilet + priceServiseFee;

        double allPrice = (numBiletsForAdults * priceAdultBiletWithService) + (numBiletsForKids * priceKidsBiletWithService);

        double profit = allPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameAvioCompany, profit);
    }
}
