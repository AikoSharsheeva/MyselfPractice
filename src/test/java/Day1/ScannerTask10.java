package Day1;

import java.util.Scanner;

public class ScannerTask10 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("What is your favorite quote?");
        String favoriteQuote=input.nextLine();
        System.out.println("Who is the author?");
        String author=input.nextLine();
        System.out.println("\"" + favoriteQuote + "\"" + " - " + author);
    }
}
