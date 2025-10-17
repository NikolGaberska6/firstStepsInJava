package ProgrammingBasics.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    System.out.printf("%.2f", num * 2.50);
                } else if (fruit.equals("apple")) {
                    System.out.printf("%.2f", num * 1.20);
                } else if (fruit.equals("orange")) {
                    System.out.printf("%.2f", num * 0.85);
                } else if (fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", num * 1.45);
                } else if (fruit.equals("kiwi")) {
                    System.out.printf("%.2f", num * 2.70);
                } else if (fruit.equals("pineapple")) {
                    System.out.printf("%.2f", num * 5.50);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", num * 3.85);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    System.out.printf("%.2f", num * 2.70);
                } else if (fruit.equals("apple")) {
                    System.out.printf("%.2f", num * 1.25);
                } else if (fruit.equals("orange")) {
                    System.out.printf("%.2f", num * 0.90);
                } else if (fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", num * 1.60);
                } else if (fruit.equals("kiwi")) {
                    System.out.printf("%.2f", num * 3.00);
                } else if (fruit.equals("pineapple")) {
                    System.out.printf("%.2f", num * 5.60);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", num * 4.20);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");



        }
    }
}

