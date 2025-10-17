package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rentHall = Integer.parseInt(scanner.nextLine());
        double statue = rentHall - (rentHall * 0.3);
        double keturing = statue - (statue * 0.15);
        double sound = keturing /2;
        double all = rentHall + statue + keturing + sound;
        System.out.printf("%.2f", all);

    }
}
