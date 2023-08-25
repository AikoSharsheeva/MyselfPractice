package Day1;

import java.util.Scanner;

public class IfElseIf22task {
    public static void main(String[] args) {
        Scanner aiko = new Scanner(System.in);
        System.out.println("Введите количество");
        int quantity = aiko.nextInt();

        if (quantity <= 0) {
            System.out.println("cannot be 0");
        } else {
            System.out.println("Напишите вашу локацию USA/Canada/Other");
            aiko.nextLine();
            String location = aiko.nextLine();

            if (quantity < 100) {
                if (location.equalsIgnoreCase("USA")) {
                    double total = quantity * 3.0;
                    System.out.println("Total cost is " + total);
                } else if (location.equalsIgnoreCase("Canada")) {
                    double total = quantity * 3.5;
                    System.out.println("Total cost is " + total);
                } else if (location.equalsIgnoreCase("Other")) {
                    double total = quantity * 4;
                    System.out.println("Total cost is " + total);
                } else {
                    System.out.println("Invalid country");
                }
            } else {
                if (location.equalsIgnoreCase("USA")) {
                    double total = quantity * 2.5;
                    System.out.println("Total cost is " + total);
                } else if (location.equalsIgnoreCase("Canada")) {
                    double total = quantity * 3.0;
                    System.out.println("Total cost is " + total);
                } else if (location.equalsIgnoreCase("Other")) {
                    double total = quantity * 3.5;
                    System.out.println("Total cost is " + total);
                } else {
                    System.out.println("Invalid country");
                }
            }
        }
    }
}






