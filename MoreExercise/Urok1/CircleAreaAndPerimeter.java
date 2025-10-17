package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double r = Double.parseDouble(scanner.nextLine());
        double S = 3.14 * (r * r);
        double C = 2 * (3.14 * r);
        System.out.printf("%.2f%n", S);
        System.out.printf("%.2f", C);




    }
}
