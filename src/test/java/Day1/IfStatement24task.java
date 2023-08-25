package Day1;

import java.util.Scanner;

public class IfStatement24task {
    public static void main(String[] args) {
        Scanner aiko=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num= aiko.nextInt();
        System.out.println("Enter 2nd number");
        int num2= aiko.nextInt();
        System.out.println("Enter 3rd number");
        int num3= aiko.nextInt();
        if(num>num2)
            if(num>num3){
                System.out.println("The greatest: 1 " + num);
            }
        if(num2>num)
            if(num2>num3){
                System.out.println("The greatest: 2 " + num2);
            }
        if(num3>num)
            if(num3>num2)
                System.out.println("The greatest: 3 " + num3);
    }
}
