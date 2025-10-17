package ProgrammingBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakDuration * 0.125;
        double timeForRest = breakDuration * 0.25;
        double leftTime = breakDuration - (timeForLunch + timeForRest);

        if(leftTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, episodeDuration - leftTime);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, episodeDuration - leftTime);

        }



    }
}
