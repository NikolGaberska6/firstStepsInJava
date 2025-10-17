package ProgrammingBasics.ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letters = scanner.nextLine();

        for (int i = 0; i < letters.length() ; i++) {
            System.out.println(letters.charAt(i));
            
        }
            
        }




    }
