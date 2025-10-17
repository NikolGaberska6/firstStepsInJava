package ProgrammingBasics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            int numPackDogs = Integer.parseInt(scanner.nextLine());
            int numPackCats = Integer.parseInt(scanner.nextLine());

            //Изчисления
            double allPackDogs = numPackDogs * 2.50;
            double allPackCats = numPackCats * 4;
            double finalPrice = allPackDogs + allPackCats;
            System.out.println(finalPrice);



        }
    }
