package Day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a java program to count a vowels of a String
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.nextLine();
        System.out.println("Number of vowels in the String: " + countVowels(word) );
    }
    public static int countVowels(String word){
        int count=0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == 'a'|| word.charAt(i) == 'e'|| word.charAt(i) == 'i'|| word.charAt(i) == 'o'|| word.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

}
