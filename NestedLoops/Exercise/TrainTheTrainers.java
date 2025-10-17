package ProgrammingBasics.NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = (scanner.nextLine());
        double totalSumGrades = 0;
        int countPresentations = 0;
        double allGreade = 0;
        double fullGrades = 0;

        while (!presentationName.equals("Finish")) {
            double allSumGrade = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                allSumGrade += grade;
                totalSumGrades = allSumGrade;
                fullGrades ++;
            }


            double avarageSumPerPresentation = allSumGrade / n;

            System.out.printf("%s - %.2f.%n", presentationName, avarageSumPerPresentation);


            presentationName = scanner.nextLine();
            allGreade += totalSumGrades;
        }
        double avarageSumAllPresentations = allGreade / fullGrades;
        System.out.printf("Student's final assessment is %.2f.", avarageSumAllPresentations);
    }
}
