package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double PetersMoney = Double.parseDouble(scanner.nextLine());
        int numVideoCards = Integer.parseInt(scanner.nextLine());
        int numProcesors = Integer.parseInt(scanner.nextLine());
        int numRamPamet = Integer.parseInt(scanner.nextLine());
        double finallprice = 0;

        double priceVideocards = numVideoCards * 250;

        double priceProcesors = priceVideocards * 0.35;
        double allPriceProcessors = numProcesors * priceProcesors;

        double priceRamPamet = priceVideocards * 0.1;
        double allPriceRamPamet = numRamPamet * priceRamPamet;

        double allPrice = priceVideocards + allPriceProcessors + allPriceRamPamet;

        if (numVideoCards > numProcesors) {
            finallprice = allPrice - (allPrice * 0.15);
        } else {
            finallprice = allPrice;
        }

        if ( PetersMoney > finallprice) {
            System.out.printf("You have %.2f leva left!",PetersMoney - finallprice );
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finallprice - PetersMoney );
        }



    }
}


