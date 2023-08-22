package Day1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Write a Java method to find the smallest number among  numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        System.out.println("Enter 3 number");
        int c=sc.nextInt();
        System.out.println("Enter 4 number");
        int d=sc.nextInt();
        System.out.println("Smallest value is " + smallest(a, b, c,d));

    }
    public  static Integer smallest(int a, int b, int c, int d){

        return Math.min(Math.min(Math.min(a, b), c), d);
//        Math.min сравнивает между двумя цифрами. Если нужно сравнить больше то добавляем метод.
    }
}
