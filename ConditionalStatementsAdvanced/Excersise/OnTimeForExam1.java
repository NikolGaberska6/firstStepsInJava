package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class OnTimeForExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hourForExam = Integer.parseInt(scanner.nextLine());
        int minutesForExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minuteArrival = Integer.parseInt(scanner.nextLine());

        // НАВРЕМЕ - в точния час ИЛИ 30 минути преди часа на изпита
        // Подранил ПОВЕЧЕ от 30 минути преди часа на изпита
        // Закъснял - след часа на изпита

        int minuteStartExam = hourForExam * 60 + minutesForExam;
        int minutesArival = hourArrival * 60 + minuteArrival;

        int diff = Math.abs(minuteStartExam - minutesArival);


        if (minutesArival > minuteStartExam) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }


        } else if (diff <= 30) {
            System.out.println("On time");
            if (minutesArival != minuteStartExam) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            int hours = diff / 60;
            int minutes = diff % 60;
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            }else {
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }


        }
    }
}

