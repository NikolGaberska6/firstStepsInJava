package ProgrammingBasics.Test2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double numDograma = Double.parseDouble(scanner.nextLine());
        String typeDogrami = scanner.nextLine();
        String typeReceiving = scanner.nextLine();
        double sum = 0;


        switch (typeDogrami) {
            case "90X130":
                sum = numDograma * 110;
                if (numDograma > 30 && numDograma < 60) {
                    sum = sum - (sum * 0.05);
                } else if (numDograma > 60) {
                    sum = sum - (sum * 0.08);
                }
                break;

            case "100X150":
                sum = numDograma * 140;
                if (numDograma > 40 && numDograma < 80) {
                    sum = sum - (sum * 0.06);
                } else if (numDograma > 80) {
                    sum = sum - (sum * 0.1);
                }
                break;

            case "130X180":
                sum = numDograma * 190;
                if (numDograma > 20 && numDograma < 50) {
                    sum = sum - (sum * 0.07);
                } else if (numDograma > 50) {
                    sum = sum - (sum * 0.12);
                }
                break;

            case "200X300":
                sum = numDograma * 250;
                if (numDograma > 25 && numDograma < 50) {
                    sum = sum - (sum * 0.09);
                } else if (numDograma > 50) {
                    sum = sum - (sum * 0.14);
                }
                break;

        }
        if (typeReceiving.equals("With delivery")) {
            sum = sum + 60;
        } else if (typeReceiving.equals("Without delivery")) {
            sum = sum;
        }

        if (numDograma > 99) {
            sum = sum - (sum * 0.04);
        } else {
            sum = sum;
        }

        if (numDograma < 10) {
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", sum);
        }

    }
}
