package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int leight = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());

        int numPiecesCake = leight * weight;
        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int piecesGuestsTake = Integer.parseInt(command);
            numPiecesCake -= piecesGuestsTake;
            if (numPiecesCake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(numPiecesCake));
                break;
            }

            command = scanner.nextLine();
        }


        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", numPiecesCake);

        }
    }
}
