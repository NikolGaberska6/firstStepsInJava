package ProgrammingBasics.WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String input = scanner.nextLine();
        int sumSearchedBooks = 0;
        boolean isFound = false;

        while (!input.equals("No More Books")) {
            if (input.equals(searchedBook)) {
                isFound = true;
                break;
            }
            sumSearchedBooks++;
            input = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", sumSearchedBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", sumSearchedBooks);
        }
    }
}