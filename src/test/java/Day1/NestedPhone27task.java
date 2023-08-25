package Day1;

import java.util.Scanner;

public class NestedPhone27task {
    public static void main(String[] args) {
        Scanner aiko = new Scanner(System.in);
        System.out.println("Vibery marky" + "\n" + "1. Iphone" + "\n" + "2. Samsung");
        int choice = aiko.nextInt();

        if (choice == 1) {
            System.out.println("Vibery model" + "\n" + "1. Iphone14 " + "\n" + "2. Iphone15");
            int model = aiko.nextInt();
            if (model == 1) {
                System.out.println("Vash vibor Iphone14");
            } else if (model == 2) {
                System.out.println("Vash vibor Iphone 15");
            } else {
                System.out.println("nevernii vvod");
            }
        } else if (choice == 2) {
            System.out.println("Vibery model" + "\n" + "1. SamsungGalaxy " + "\n" + "2. SamsungUltra");
            int model2 = aiko.nextInt();

            if (model2 == 1) {
                System.out.println("Vash vibor SamsungGalaxy");
            } else if (model2 == 2) {
                System.out.println("Vash vibor SamsungUltra");
            } else {
                System.out.println("Nevernii vvod 2");
            }
        }
    }
}
