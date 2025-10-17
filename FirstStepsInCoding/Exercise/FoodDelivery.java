package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            int numchickenMenu = Integer.parseInt(scanner.nextLine());
            int numfishMenu = Integer.parseInt(scanner.nextLine());
            int numveganMenu = Integer.parseInt(scanner.nextLine());

            //Изчисления
            double chickenMenu = numchickenMenu * 10.35;
            double fishMenu = numfishMenu * 12.40;
            double veganMenu = numveganMenu * 8.15;
            double fullPriceForMenues = chickenMenu + fishMenu + veganMenu;
            double priceForDesert = fullPriceForMenues * 0.2;
            double priceForDelivery = 2.50;
            double fullPriceForOrder = fullPriceForMenues + priceForDesert + priceForDelivery;

            //Изход
            System.out.println(fullPriceForOrder);

        }
    }
