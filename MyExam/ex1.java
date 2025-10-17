package ProgrammingBasics.MyExam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeopleINGroup = Integer.parseInt(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());
        int numCardsForTransport = Integer.parseInt(scanner.nextLine());
        int numBiletsForMuseum = Integer.parseInt(scanner.nextLine());

        double sumFor1Person = numNights * 20;
        double allCards = numCardsForTransport * 1.60;
        double allBilets = numBiletsForMuseum * 6;

        double allSumFor1Person = sumFor1Person + allCards + allBilets;
        double allSumForAllGroup = allSumFor1Person * numPeopleINGroup;

        double finalSum = allSumForAllGroup + (allSumForAllGroup * 0.25);

        System.out.printf("%.2f", finalSum);


    }
}
