package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKilogramVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKilogramFruits = Double.parseDouble(scanner.nextLine());
        int allKilogramVegetables = Integer.parseInt(scanner.nextLine());
        int allKilogramFruits = Integer.parseInt(scanner.nextLine());

        double moneyVegetables = priceForKilogramVegetables * allKilogramVegetables;
        double moneyFruits = priceForKilogramFruits * allKilogramFruits;

        double allMoney = moneyFruits + moneyVegetables;
        double moneyInEuro = allMoney / 1.94;

        System.out.printf("%.2f", moneyInEuro);
    }
}
