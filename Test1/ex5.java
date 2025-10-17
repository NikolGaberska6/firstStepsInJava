package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String field = scanner.nextLine();
        double allPoints = 301;
        double pointsForShot = 0;
        int unsuccessfulShots = 0;
        int successfulShots = 0;

        while (!field.equals("Retire")) {
            double points = Double.parseDouble(scanner.nextLine());

            if (field.equals("Single")) {
                pointsForShot = points;
            } else if (field.equals("Double")) {
                pointsForShot = points * 2;
            } else if (field.equals("Triple")) {
                pointsForShot = points * 3;
            }

            if (pointsForShot <= allPoints) {
                allPoints -= pointsForShot;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }

            if (allPoints == 0) {
                break;
            }


            field = scanner.nextLine();
        }


        if (allPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShots);
        }

    }
}
