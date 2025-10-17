package ProgrammingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGroupsClimbers = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int numPeopleInGroup = 0;
        double PeopleMusala = 0;
        double PeopleMonblan = 0;
        double Kilimandjaro = 0;
        double K2 = 0;
        double Everest = 0;



        for (int i = 1; i <= numGroupsClimbers; i++) {
            int numPeople = Integer.parseInt(scanner.nextLine());
            allPeople += numPeople;
            if (numPeople <= 5) {
                PeopleMusala += numPeople;
            } else if (numPeople <= 12) {
                PeopleMonblan += numPeople;
            } else if (numPeople <= 25) {
                Kilimandjaro += numPeople;
            } else if (numPeople <= 40) {
                K2 += numPeople;
            } else {
                Everest += numPeople;
            }
        }
        System.out.printf("%.2f%%%n", (PeopleMusala/allPeople) * 100);
        System.out.printf("%.2f%%%n", (PeopleMonblan/allPeople) * 100);
        System.out.printf("%.2f%%%n", (Kilimandjaro/allPeople) * 100);
        System.out.printf("%.2f%%%n", (K2/allPeople) * 100);
        System.out.printf("%.2f%%%n", (Everest/allPeople) * 100);
    }
}



