package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int numLines = Integer.parseInt(scanner.nextLine());
        int numColums = Integer.parseInt(scanner.nextLine());

        switch (projection) {
            case "Premiere":
                System.out.printf("%.2f %nleva", numColums * numLines * 12.00);
                break;

            case "Normal":
                System.out.printf("%.2f %nleva", numColums * numLines * 7.50);
                break;

            case "Discount":
                System.out.printf("%.2f %nleva", numColums * numLines * 5.00);
                break;

        }
    }
}