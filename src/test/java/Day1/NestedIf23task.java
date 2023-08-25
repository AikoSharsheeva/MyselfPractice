package Day1;

import java.util.Scanner;

public class NestedIf23task {
    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner aiko=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= aiko.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        } else if (num>0) {
            System.out.println("Number is positive");
        }
    }
}
