package ProgrammingBasics.WhileLoop.Lab;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 0;
        int fails = 0;
        double sum = 0;

        while (grade < 12) {
            double yearsRating = Double.parseDouble(scanner.nextLine());
            if (yearsRating < 4) {
                fails++;
            }
            sum += yearsRating;
            if (fails == 2) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
            grade++;
        }
        double avarageSum = sum / grade;
        if (fails < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avarageSum);

        }
    }
}
