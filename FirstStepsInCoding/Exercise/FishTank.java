package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Прочитане на вход
            int length = Integer.parseInt(scanner.nextLine());
            int wight = Integer.parseInt(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double percent = Double.parseDouble(scanner.nextLine());
            //Пресмятане
            int volume = length * wight * height;
            double fullTankLiters = volume * 0.001;

            double neededLiters = fullTankLiters * (1 -percent/100);

            System.out.println(neededLiters);



        }
    }
