package ProgrammingBasics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            double meters = Double.parseDouble(scanner.nextLine());

            //Изчисления
            double price = meters * 7.61;
            double discount = price * 0.18;
            double finalPrice = price - discount;

            //Изход
            System.out.printf("The final price is %s, %nThe discount is %s", finalPrice, discount );
        }
    }


