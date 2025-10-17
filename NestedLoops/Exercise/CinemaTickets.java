package ProgrammingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int numStandartsBuilets = 0;
        int numStudentsBilets = 0;
        int numKidsBilets = 0;
        int totalTickets = 0;


        while (!filmName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeBilet = scanner.nextLine();
            int countMovieTickets = 0;
            while (!typeBilet.equals("End")) {
                countMovieTickets++;
                switch (typeBilet) {
                    case "student":
                        numStudentsBilets++;
                        break;
                    case "standard":
                        numStandartsBuilets++;
                        break;
                    case "kid":
                        numKidsBilets++;
                        break;
                }
                if (countMovieTickets >= freeSeats) {
                    break;
                }

                typeBilet = scanner.nextLine();
            }

            totalTickets += countMovieTickets;

                double percentBuySpace = (1.0 * countMovieTickets / freeSeats) * 100;
                System.out.printf("%s - %.2f%% full.%n", filmName, percentBuySpace);

            filmName = scanner.nextLine();
            }



        double percentStudentsBilets = (1.0 * numStudentsBilets/totalTickets) * 100;
        double percentStandartsBilets = (1.0 * numStandartsBuilets/totalTickets) * 100;
        double percentKidsBilets = (1.0 * numKidsBilets/totalTickets) * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentsBilets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandartsBilets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidsBilets);

        }
    }