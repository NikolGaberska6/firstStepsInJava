package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        String command = scanner.nextLine();


        switch (command) {
            case "day":
                if (n < 20) {
                    sum = 0.70 + n * 0.79;
                } else if (n >= 20) {
                    sum = 0.09  * n;
                } else if (n >= 100) {
                    sum = n * 0.06;
                }
                System.out.printf("%.2f", sum);
                break;
            case "night":
                if (n < 20) {
                    sum = 0.70 + n * 0.90;
                } else if (n > 20 && n < 100) {
                    sum = 0.09 * n;
                } else if (n > 100) {
                    sum = n * 0.06;
                }
                System.out.printf("%.2f", sum);
                break;
        }

    }
}
