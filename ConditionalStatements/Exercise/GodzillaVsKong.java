package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budetForFilm = Double.parseDouble(scanner.nextLine());
        int numStatists = Integer.parseInt(scanner.nextLine());
        double priceClothesFor1Statist = Double.parseDouble(scanner.nextLine());

        double decor = Math.floor(budetForFilm * 0.1);
        double sumForClothes = Math.floor(numStatists * priceClothesFor1Statist);

        if(numStatists > 150) {
            sumForClothes = sumForClothes -(sumForClothes * 0.1);
        } else {
            sumForClothes = sumForClothes;
        }

        double all = budetForFilm + sumForClothes;

        if ( all > budetForFilm) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", all - budetForFilm);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budetForFilm - all);
        }
    }
}
