package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPaintedEggs = Integer.parseInt(scanner.nextLine());
        int numRedEggs = 0;
        int numOrangeEggs = 0;
        int numBlueEggs = 0;
        int numGreenEggs = 0;
        int maxEggs = Integer.MIN_VALUE;
        String color = "";

        for (int i = 0; i <numPaintedEggs; i++) {
            String colorOfEgg = scanner.nextLine();
            switch (colorOfEgg) {
                case "red":
                    numRedEggs ++;
                    if (maxEggs < numRedEggs) {
                        maxEggs = numRedEggs;
                        color = "red";
                    }
                    break;
                case "orange":
                    numOrangeEggs ++;
                    if (maxEggs < numOrangeEggs) {
                        maxEggs = numOrangeEggs;
                        color = "orange";
                    }
                    break;
                case "blue":
                    numBlueEggs ++;
                    if (maxEggs < numBlueEggs) {
                        maxEggs = numBlueEggs;
                        color = "blue";
                    }
                    break;
                case "green":
                    numGreenEggs ++;
                    if (maxEggs < numGreenEggs) {
                        maxEggs = numGreenEggs;
                        color = "green";
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", numRedEggs);
        System.out.printf("Orange eggs: %d%n", numOrangeEggs);
        System.out.printf("Blue eggs: %d%n", numBlueEggs);
        System.out.printf("Green eggs: %d%n", numGreenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggs, color);


    }
}
