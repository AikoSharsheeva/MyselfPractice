package Day1;

public class Task2 {
    public static void main(String[] args) {
//        write a method to compute the average of 3 numbers
        int a=25;
        int b=45;
        int c=65;
        System.out.println("Average num is " + average(a,b,c) );
    }
    public  static Integer average (int a, int b, int c){
        return (a+b+c)/3;
    }
}
