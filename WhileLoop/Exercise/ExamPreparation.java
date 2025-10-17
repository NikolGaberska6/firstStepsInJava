package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int allowedBadGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sum = 0;
        int numBadGrades = 0;
        int allEx = 0;
        String lastEx = "";

        while (!command.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                numBadGrades++;
                if (numBadGrades >= allowedBadGrades) {
                    System.out.printf("You need a break, %d poor grades.", numBadGrades);
                    break;
                }
            }
            sum += grade;
            allEx++;
            lastEx = command;
            command = scanner.nextLine();
        }

            double avarageSum = sum/allEx;
            if (command.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", avarageSum);
                System.out.printf("Number of problems: %d%n", allEx);
                System.out.printf("Last problem: %s", lastEx);
            }


        }
    }