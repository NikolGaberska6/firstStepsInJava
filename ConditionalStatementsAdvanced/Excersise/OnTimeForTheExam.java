package ProgrammingBasics.ConditionalStatementsAdvanced.Excersise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourForExam = Integer.parseInt(scanner.nextLine());
        int minutesForExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minuteArrival = Integer.parseInt(scanner.nextLine());

        // НАВРЕМЕ - в точния час ИЛИ 30 минути преди часа на изпита
        // Подранил ПОВЕЧЕ от 30 минути преди часа на изпита
        // Закъснял - след часа на изпита

        double minuteStartExam = hourForExam * 60 + minutesForExam;
        double minutesArival = hourArrival * 60 + minuteArrival;

        double diff = Math.abs(minuteStartExam - minutesArival);
        double diff2 = Math.abs(hourForExam - hourArrival);
        double diff3 = Math.abs(minutesForExam - minuteArrival);


        if (minutesArival > minuteStartExam) {
            System.out.println("Late");
            if (minutesArival > minuteStartExam && diff < 60) {
                System.out.printf("Late %n%.0f minutes after the start", diff);
            } else if (minutesArival > minuteStartExam && diff >= 60) {
                System.out.printf("Late %n%f:%.0f hours after the start", diff2, diff);
            }

        } else if (minutesArival == minuteStartExam || diff <= 30) {
            System.out.println("On time");
        } else if (diff > 30) {
            System.out.println("Early");
            if (minutesArival < minuteStartExam && diff < 60) {
                System.out.printf("Early %n%.0f minutes before the start", diff);
            } else if (minutesArival < minuteStartExam && diff >= 60) {
                System.out.printf("Early %n%f:%.0f hours before the start", diff2, diff);


                // }else if (minutesArival > minuteStartExam && diff < 60) {
                // System.out.printf("Late %n%.0f minutes after the start", diff);
                //  } if (minutesArival > minuteStartExam && diff >= 60) {
                //  System.out.printf("Late %n%.0f:%.0f hours after the start", diff2, diff3);
                // } else if ( diff <= 30 || minutesArival == minuteStartExam) {
                //     System.out.printf("On time");
                //  } else if (minutesArival < minuteStartExam && diff <60) {
                //   System.out.printf("On time %n%.0f minutes before the start", diff);
                //  } else if (diff > 30) {
                //     System.out.printf("Early %n%.0f:%.0f hours before the start",diff2, diff3);
                ///   } else if ( minutesArival < minuteStartExam && diff >= 60) {
                //   System.out.printf("Early %n %f:%.2f hours before the start", diff2, diff3);
            }
        }
    }
}


//else if ( diff <= 30 || minutesArival == minuteStartExam) {
//            System.out.printf("On time%n%.0f minutes before the start", diff );