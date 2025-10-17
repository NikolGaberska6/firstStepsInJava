package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = Integer.parseInt(scanner.nextLine());
        int leight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeCubicMeters = weight * leight * height;
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int myCubicMeters = Integer.parseInt(command);
            freeCubicMeters -= myCubicMeters;
            if (freeCubicMeters <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeCubicMeters));
                break;
            }
            command = scanner.nextLine();

        }
        if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", freeCubicMeters);

        }

    }
}
