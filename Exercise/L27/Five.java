package ProgrammingBasics.Exercise.L27;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        for (int i = 0; i < n.length() ; i++) {
          char symbol = n.charAt(i);
          System.out.println(symbol);

        }



    }
}
