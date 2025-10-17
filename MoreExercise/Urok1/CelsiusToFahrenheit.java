package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double degreesCelsii = Double.parseDouble(scanner.nextLine());

        double degreesF = degreesCelsii * 9/5 + 32;
        System.out.printf("%.2f", degreesF);
    }
}
