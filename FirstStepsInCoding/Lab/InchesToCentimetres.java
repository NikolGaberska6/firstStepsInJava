package ProgrammingBasics.FirstStepsInCoding.Lab;


import java.util.Scanner;

    public class InchesToCentimetres {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            double inches = Double.parseDouble(scanner.nextLine());
            //Пресмтания
            double centimeters = inches*2.54;
            //принтиране на резултат
            System.out.println(centimeters);

        }
    }
