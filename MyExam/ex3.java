package ProgrammingBasics.MyExam;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numDancers = Integer.parseInt(scanner.nextLine());
        double numPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = scanner.nextLine();
        double moneyForCharity = 0;

        double wonSum = numDancers * numPoints;

        switch (country) {
            case "Bulgaria":
                wonSum = wonSum;
                if (season.equals("summer")) {
                    wonSum = wonSum - (wonSum * 0.05);
                } else if (season.equals("winter")) {
                    wonSum = wonSum - (wonSum * 0.08);
                }

                break;
            case "Abroad":
                wonSum = wonSum + (wonSum * 0.5);
                if (season.equals("summer")) {
                    wonSum = wonSum - (wonSum * 0.1);
                } else if (season.equals("winter")) {
                    wonSum = wonSum - (wonSum * 0.15);
                }
                break;

        }

        moneyForCharity = 0.75 * wonSum;
        double leftMoney = wonSum - moneyForCharity;
        double moneyForDanecrs = leftMoney/numDancers;

        System.out.printf("Charity - %.2f\n", moneyForCharity);
        System.out.printf("Money per dancer - %.2f\n", moneyForDanecrs);


    }
}
