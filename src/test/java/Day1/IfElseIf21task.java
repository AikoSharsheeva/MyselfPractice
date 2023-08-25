package Day1;

import java.util.Scanner;

public class IfElseIf21task {
    public static void main(String[] args) {
        //Вложенный IF
        Scanner sc=new Scanner(System.in);
        System.out.println("Write your health status good/bad");
        String status=sc.nextLine();
        if(status.equals("good")) {
            System.out.println("Enter your fitness level high/med/low");
            String levelFitness = sc.nextLine();

            if (levelFitness.equals("high")) {//Вложенный IF если выбрать один вариант и что в него входит
                System.out.println(" We recommend you  to prepare for a full marathon");
            } else if (levelFitness.equals("med")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if (levelFitness.equals("low")) {
                System.out.println("We recommend you to prepare for a 5km run");
            } else
                System.out.println("Wrong enter");
        }
            else if(status.equals("bad")) {// Тут другой вариант
                System.out.println("We recommend you to participate in the marathon by walking");
            }else{
                    System.out.println("write status good or bad");
                }
            }
        }

