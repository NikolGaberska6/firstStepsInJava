package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int numNights = Integer.parseInt(scanner.nextLine());
        double moneyPerNight= 0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                 moneyPerNight = 30;
                } else if (dates.equals("24-27")) {
                    moneyPerNight = 35;
                } else if (dates.equals("28-31")) {
                    moneyPerNight = 40;
                }
                break;

            case "Italy":
                if (dates.equals("21-23")) {
                    moneyPerNight = 28;
                } else if (dates.equals("24-27")) {
                    moneyPerNight = 32;
                } else if (dates.equals("28-31")) {
                    moneyPerNight = 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    moneyPerNight = 32;
                } else if (dates.equals("24-27")) {
                    moneyPerNight = 37;
                } else if (dates.equals("28-31")) {
                    moneyPerNight = 43;
                }
                break;
        }
        double allExpense = numNights * moneyPerNight;
        System.out.printf("Easter trip to %s : %.2f leva.",destination, allExpense);
    }
}
