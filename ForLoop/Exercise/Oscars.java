package ProgrammingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double firstPointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double sumAllPoints = firstPointsFromAcademy;


        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double sum = (name.length() * points) / 2;
            sumAllPoints += sum;
            if (sumAllPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
                break;
            }
        }
            if (sumAllPoints < 1250.5) {
                System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(sumAllPoints - 1250.5));
            }


        }
    }
