package ProgrammingBasics.ForLoop.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  int n = Integer.parseInt(scanner.nextLine());

        ///  for (int i = 1000; i >= n;  i -= 3) {
        ///     System.out.println(i);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(2));
        }
    }
}


