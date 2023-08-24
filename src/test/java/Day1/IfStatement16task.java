package Day1;

import java.util.Scanner;

public class IfStatement16task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your body temperature");
        double num=sc.nextDouble();
        if(num<35){
            System.out.println("Drink some hot tea to warm");
        }
        if (num>37){
            System.out.println("Take tylenol to bring your temperature down");
        }
    }
}
