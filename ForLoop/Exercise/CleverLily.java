package ProgrammingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N години
        //Нечетни рд ИГРАЧКИ
        // Четни рд получава ПАРИ
        //Брат и зима по лев всяка година
        // 2ри рд - получава 10 лева, 4ти рд - получава 20 лева, 6ти рд - получава 30 лев и тн.
        // към ПАРИТЕ от четните рд Лени добавя парите от ПРОДАДЕНИТЕ ИГРАЧКИ


        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMashine = Double.parseDouble(scanner.nextLine());
        int priceFor1Toy = Integer.parseInt(scanner.nextLine());

        int sumEvenYears = 0;
        int sumOddYears = 0;

        for (int i = 1; i <= age; i++) {
            if( i%2 == 0) {
                sumEvenYears += i * 5 - 1;
            } else {
                sumOddYears ++;
            }
        }

        double priceAllToysOddYears = (sumOddYears * priceFor1Toy);
        double allMoney = sumEvenYears + priceAllToysOddYears;

        if (allMoney >= priceWashingMashine) {
            System.out.printf("Yes! %.2f", allMoney - priceWashingMashine);
        } else {
            System.out.printf("No! %.2f", Math.abs(allMoney - priceWashingMashine));
        }






    }
}

