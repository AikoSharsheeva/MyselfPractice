package Day1;

import java.util.Scanner;

public class IfStatemenet25task {
    public static void main(String[] args) {
        Scanner aiko = new Scanner(System.in);
        System.out.println("Write number from 1 to 7");
        int num = aiko.nextInt();
        if(num>7|| num<=0) {
            System.out.println("Invalid enter");
        }
            if (num == 1) {
                System.out.println("Monday");
            }
            if (num == 2) {
                System.out.println("Tuesday");
            }
            if (num == 3) {
                System.out.println("Wednesday");
            }
            if (num == 4) {
                System.out.println("Thursday");
            }
            if (num == 5) {
                System.out.println("Friday");
            }
            if (num == 6) {
                System.out.println("Saturday");
            }
            if (num == 7) {
                System.out.println("Sunday");
            }
        }

    }

