package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            int yearTaskForTRainig = Integer.parseInt(scanner.nextLine());

            //Изчисления
            double basketShoes = (yearTaskForTRainig - (yearTaskForTRainig * 0.4));
            double basketEquipment = (basketShoes - (basketShoes * 0.2));
            double basketBall = 0.25 * basketEquipment;
            double basketAccessories = 0.2 * basketBall;
            double finallPrice = yearTaskForTRainig + basketShoes + basketEquipment + basketBall + basketAccessories;

            //Изход
            System.out.println(finallPrice);
        }
    }

