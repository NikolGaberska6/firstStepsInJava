package ProgrammingBasics.MyExam;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        double allDegreesPetLiter = 0;
        double allBrandy = 0;
        double allDegrees = allDegreesPetLiter;

        for (int i = 0; i < numDays; i++) {
            double amountOfBrandy = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());

            allDegreesPetLiter = amountOfBrandy * degrees;
            allDegrees += allDegreesPetLiter;
            allBrandy += amountOfBrandy;

        }
        allBrandy = allBrandy;
        double avarageSum = allDegrees/allBrandy;

        System.out.printf("Liter: %.2f%n", allBrandy);
        System.out.printf("Degrees: %.2f%n", avarageSum);

        if (avarageSum < 38) {
            System.out.println("Not good, you should baking!");
        } else if (avarageSum >= 38 && avarageSum <= 42) {
            System.out.println("Super!");
        } else if (avarageSum > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}