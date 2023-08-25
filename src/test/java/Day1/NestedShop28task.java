package Day1;

import java.util.Scanner;

public class NestedShop28task {
    public static void main(String[] args) {
        Scanner aiko=new Scanner(System.in);
        System.out.println("Vibery prodykti" + "\n"+ "1.Hleb" + "\n" + "2.Krypa");
        int choice= aiko.nextInt();

        if(choice==1){
            System.out.println("Vibery vid hleba" + "\n"+ "1.chernii" + "\n" + "2.belii");
            int vid=aiko.nextInt();
            if(vid==1){
                System.out.println("Vash vibor chernii hleb");
            } else if (vid==2) {
                System.out.println("Vash vibor belii hleb!");
            }else{
                System.out.println("neverno");
            }
        }else if(choice==2){
            System.out.println("Vibery vid krypi" + "\n"+ "1.ris" + "\n" + "2.grechka");
            int krypa=aiko.nextInt();
            if(krypa==1){
                System.out.println("Ti vibral ris");
            } else if (krypa==2) {
                System.out.println("Ti vibral grecky!");
            }else{
                System.out.println("nevernii vid krypi!");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
