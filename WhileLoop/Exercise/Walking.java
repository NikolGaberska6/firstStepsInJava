package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstSteps = 0;

        while (!command.equals("Going home")) {
            double steps = Double.parseDouble(command);
            firstSteps += steps;
            if (firstSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", firstSteps - 10000);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int moreSteps = Integer.parseInt(scanner.nextLine());
            firstSteps += moreSteps;
            if (firstSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", firstSteps - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(10000 - firstSteps));
            }

        }
    }
}

