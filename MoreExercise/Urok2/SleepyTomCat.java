package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numFreeDays = Integer.parseInt(scanner.nextLine());

        double freeDaysMinutesPlay = numFreeDays * 127;
        double workdays = 365 - numFreeDays;
        double workDaysMinutesPlay = workdays * 63;
        double allTimeToPlay = freeDaysMinutesPlay + workDaysMinutesPlay;
        double diff = 30000 - allTimeToPlay;

        double newHours = Math.floor(diff/60);
        double newMinutes = diff % 60;

        if (allTimeToPlay < 30000) {
            System.out.printf("Tom sleeps well%n%.0f hours and %.0f minutes less for play", newHours, newMinutes);

        } if (allTimeToPlay > 30000) {
            System.out.printf("Tom will run away%n%.0f hours and %.0f minutes more for play", Math.abs(newHours) - 1, Math.abs(newMinutes));
        }

    }
}
