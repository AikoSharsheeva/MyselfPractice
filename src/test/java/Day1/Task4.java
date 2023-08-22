package Day1;

import java.util.Scanner;

public class Task4 {
//    The program should prompt the user
//    to input a number that is less than 26 and print all letters from the given String until the given index (exclusively).

    public static void main(String args[]) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num >= 1 && num <= letters.length()) {
            System.out.print("Result: ");
            for (int i = 0; i < num; i++) {
                System.out.print(letters.charAt(i));
            }
            System.out.println(); // Print a newline after the letters
        } else {
            System.out.println("Error! Invalid number" + letters.length());
        }
    }
}


