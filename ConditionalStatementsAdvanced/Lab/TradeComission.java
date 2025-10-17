package ProgrammingBasics.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());


        switch (town) {
            case "Sofia":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    System.out.printf("%.2f", salesVolume * 0.05);
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    System.out.printf("%.2f", salesVolume * 0.07);
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    System.out.printf("%.2f", salesVolume * 0.08);
                } else {
                    System.out.printf("%.2f", salesVolume * 0.12);
                }
                break;

            case "Varna":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    System.out.printf("%.2f", salesVolume * 0.045);
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    System.out.printf("%.2f", salesVolume * 0.075);
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    System.out.printf("%.2f", salesVolume * 0.1);
                } else {
                    System.out.printf("%.2f", salesVolume * 0.13);
                }
                break;

            case "Plovdiv":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    System.out.printf("%.2f", salesVolume * 0.055);
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    System.out.printf("%.2f", salesVolume * 0.08);
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    System.out.printf("%.2f", salesVolume * 0.12);
                } else {
                    System.out.printf("%.2f", salesVolume * 0.145);
                }
                break;
            default:
                System.out.println("error");


        }
    }
}
