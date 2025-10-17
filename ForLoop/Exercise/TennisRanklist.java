package ProgrammingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numTurnir = Double.parseDouble(scanner.nextLine());
        int firstNumPoints = Integer.parseInt(scanner.nextLine());
        int numPointsForOption = 0;
        int sumFinalPoints = 0;
        int allPoints = firstNumPoints;
        double numWTurnirs = 0;

        for (int i = 1; i <= numTurnir; i++) {
            String options = scanner.nextLine();
            switch (options) {
                case "W":
                    numPointsForOption = 2000;
                    allPoints = numPointsForOption + allPoints;
                   numWTurnirs ++;
                    break;
                case "F":
                    numPointsForOption = 1200;
                    allPoints = numPointsForOption + allPoints;
                    break;
                case "SF":
                    numPointsForOption = 720;
                    allPoints = numPointsForOption + allPoints;
                    break;
            }
            sumFinalPoints = allPoints;

        }
        double touramentPoints =  allPoints - firstNumPoints;
        double avarage = touramentPoints/numTurnir;
        System.out.printf("Final points: %d%n", sumFinalPoints);
        System.out.printf("Average points: %.0f%n", avarage);
        System.out.printf("%.2f%%", (numWTurnirs/numTurnir)* 100);
    }
}
