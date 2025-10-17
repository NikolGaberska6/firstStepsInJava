package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double P1H = P1 * H;
        double P2H = P2 * H;
        double all = P1H + P2H;

        double percentAll = all/100 * V;




    }
}
