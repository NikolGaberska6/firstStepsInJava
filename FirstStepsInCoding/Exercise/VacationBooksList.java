package ProgrammingBasics.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Прочитане на вход
            int numOfPages = Integer.parseInt(scanner.nextLine());
            int pagesFor1Hour = Integer.parseInt(scanner.nextLine());
            int numbOfDays = Integer.parseInt(scanner.nextLine());
            //Изчисления
            int fullTime = numOfPages/pagesFor1Hour;
            int neededHours = fullTime/numbOfDays;
            System.out.println(neededHours);

        }
    }


