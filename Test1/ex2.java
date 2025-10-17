package ProgrammingBasics.Test1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int numScenes = Integer.parseInt(scanner.nextLine());
        int timeFor1Scene = Integer.parseInt(scanner.nextLine());

        double terenTime = timeForPhotos * 0.15;
        double allTimeForPhotos = numScenes * timeFor1Scene;
        double neededTime = terenTime + allTimeForPhotos;

        if (neededTime > timeForPhotos) {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededTime - timeForPhotos);
        } else if (neededTime <= timeForPhotos) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeForPhotos - neededTime);

        }
    }
}
