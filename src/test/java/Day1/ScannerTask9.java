package Day1;

import java.util.Scanner;

public class ScannerTask9 {
    public static void main(String[] args) {
        Scanner aiko=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country= aiko.nextLine();
        System.out.println("Im lucky to have a friend like you from " + country);

    }
}
