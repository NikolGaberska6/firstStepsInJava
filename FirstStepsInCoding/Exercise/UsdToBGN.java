package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class UsdToBGN {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            double usd = Double.parseDouble(scanner.nextLine());

            //Изчисления
            double bgn = usd * 1.79549;
            System.out.println(bgn);
        }
    }


