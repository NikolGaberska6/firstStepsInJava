package ProgrammingBasics.MoreExercise.Urok1;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //стените - зелена боя - 1 литър разход = 3.4
        //покрив - червена - 1 литър разход = 4.3

        double areaSideWall = x * y;
        double window = 1.5;
        double areaWindow =  window * window;
        double twoSidesAll = 2 * areaSideWall - 2 * areaWindow;
        double backWall = x * x;
        double door = 1.2 * 2;
        double AllFrontAndBack = 2 * backWall - door;
        double all = twoSidesAll + AllFrontAndBack;
        double greenPaint = all / 3.4;
        System.out.printf("%.2f%n", greenPaint);

        double twoRectangularRoof = 2 * (x * y);
        double twoTriangular = 2 * (x * h /2);
        double allRoof = twoRectangularRoof + twoTriangular;
        double redPaint = allRoof/4.3;
        System.out.printf("%.2f", redPaint);
    }
}
