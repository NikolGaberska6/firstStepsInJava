package ProgrammingBasics.MyExam;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numSeas = Integer.parseInt(scanner.nextLine());
        int numMount = Integer.parseInt(scanner.nextLine());
        String packet = scanner.nextLine();
        double sum = 0;

        while (!packet.equals("Stop")) {

            switch (packet) {
                case "sea":
                    if (numSeas <= 0) {
                        break;
                    }
                    sum = sum + 680;
                    numSeas--;
                    break;
                case "mountain":
                    if (numMount <= 0) {
                        break;
                    }
                    sum = sum + 499;
                    numMount--;
                    break;
            }

            if (numSeas <= 0 && numMount <= 0) {
                System.out.println("Good job! Everything is sold.");
                System.out.printf("Profit: %.0f leva.", sum);
                break;
            }

            packet = scanner.nextLine();
        }
        if (packet.equals("Stop")) {
            System.out.printf("Profit: %.0f leva.", sum);
        }
    }
}
