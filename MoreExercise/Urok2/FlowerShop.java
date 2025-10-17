package ProgrammingBasics.MoreExercise.Urok2;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int r = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        double priceForPresent = Double.parseDouble(scanner.nextLine());


        double priceForM = m * 3.25;
        double priceForZ = z * 4;
        double priceForR = r * 3.50;
        double priceForK = k * 8;

        double allSum = priceForM + priceForZ + priceForR + priceForK;
        double tax = allSum * 0.05;
        double finalSum = allSum - tax;


        double diff = Math.abs(priceForPresent - finalSum);
        if (priceForPresent < finalSum) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }




    }
}
