package Day1;

import java.util.Scanner;

public class Switch29task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number betwee 1 to 7");
        int num=sc.nextInt();
        String day;

        switch(num){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Invalid day";
                break;
        }
        System.out.println("Day of the week " + day);
    }
}
