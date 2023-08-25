package Day1;

import java.util.Scanner;

public class SwitchSeason30task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a season");
        String season= sc.nextLine();
        switch (season){
            case "winter":
                System.out.println("December \nJanuary \nFebruary");
                break;
            case "spring":
                System.out.println("March \nApril \nMay");
                break;
            case "summer":
                System.out.println("June \nJuly \nAugust");
                break;
            case "fall":
                System.out.println("September \nOctober \nNovember");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
