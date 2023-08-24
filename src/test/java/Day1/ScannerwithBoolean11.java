package Day1;

import java.util.Scanner;

public class ScannerwithBoolean11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you married?");
        boolean marriedStatus=scanner.nextBoolean();
        System.out.println(marriedStatus);
    }
}
