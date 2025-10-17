package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkrumpriqPerKilogram = Double.parseDouble(scanner.nextLine());
        double priceCacaPerKilogram = Double.parseDouble(scanner.nextLine());
        double kilogramPalamud = Double.parseDouble(scanner.nextLine());
        double kilogramSafid = Double.parseDouble(scanner.nextLine());
        int kilogramMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamudPerKilogram = priceSkrumpriqPerKilogram + priceSkrumpriqPerKilogram * 0.6;
        double allMoneyPalamud = kilogramPalamud * pricePalamudPerKilogram;

        double priceSafidPerKilogram = priceCacaPerKilogram + priceCacaPerKilogram * 0.8;
        double allMoneySafid = kilogramSafid * priceSafidPerKilogram;

        double allMoneyMidi = kilogramMidi * 7.50;


        double allMoney =  allMoneyPalamud + allMoneySafid + allMoneyMidi;
        System.out.printf("%.2f", allMoney);


    }
}
