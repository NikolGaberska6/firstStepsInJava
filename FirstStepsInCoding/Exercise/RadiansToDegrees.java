package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class RadiansToDegrees {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            double radians = Double.parseDouble(scanner.nextLine());

            //Изчисления
            double degrees = radians * 180/ Math.PI;

            System.out.println(degrees);


        }
    }

