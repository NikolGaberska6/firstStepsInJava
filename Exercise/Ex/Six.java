package ProgrammingBasics.Exercise.Ex;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String name = scanner.nextLine();

        for (int i = 0; i <name.length(); i++) {
            char symbol = name.charAt(i);
            switch (symbol) {
                case 'a':
                    sum = sum += 1;
                    break;
                case 'e':
                  sum = sum += 2;
                    break;
                case 'i':
                    sum = sum += 3;
                    break;
                case 'o':
                    sum = sum += 4;
                    break;
                case 'u':
                    sum = sum += 5;
                    break;
            }
        }
        System.out.println(sum);



    }
}
