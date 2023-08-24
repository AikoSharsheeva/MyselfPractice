package Day1;

import java.util.Scanner;

public class ScannerCompoundOperators12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter the sale amount:");
        double total=sc.nextDouble();
        System.out.println("Please enter the tax rate:");
        double tax=sc.nextDouble();
        total += total * tax / 100;
        System.out.println(total );//107
    }
}
