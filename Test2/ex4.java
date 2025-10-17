package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBalls = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int numRedBalls = 0;
        int numOrangeBalls = 0;
        int numYellowBalls = 0;
        int numWhiteBalls = 0;
        int numBlackBalls = 0;
        int numOtherColours = 0;
        double allPoints = 0;

        for (int i = 1; i <= numBalls; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    points += 5;
                    numRedBalls++;
                    break;
                case "orange":
                    points += 10;
                    numOrangeBalls++;
                    break;
                case "yellow":
                    points += 15;
                    numYellowBalls++;
                    break;
                case "white":
                    points += 20;
                    numWhiteBalls++;
                    break;
                case "black":
                    points = points / 2;
                    numBlackBalls++;
                    break;
            }
            if (!colour.equals("red") && (!colour.equals("orange"))
                    && (!colour.equals("yellow")) && (!colour.equals("white"))
                    && (!colour.equals("black"))) {
                numOtherColours ++;
            }
            allPoints = points;
        }

        System.out.printf("Total points: %.0f\n", allPoints);
        System.out.printf("Red balls: %d\n", numRedBalls);
        System.out.printf("Orange balls: %d\n", numOrangeBalls);
        System.out.printf("Yellow balls: %d\n", numYellowBalls);
        System.out.printf("White balls: %d\n", numWhiteBalls);
        System.out.printf("Other colors picked: %d\n",numOtherColours);
        System.out.printf("Divides from black balls: %d%n",numBlackBalls);
    }
}
