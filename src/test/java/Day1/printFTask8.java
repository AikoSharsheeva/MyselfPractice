package Day1;

public class printFTask8 {
    public static void main(String[] args) {
        int lengthofWall=300;
        int heightofWall=200;
        int brikslength=20;
        int briksheight=10;
        int amount=((lengthofWall/brikslength)*(heightofWall/briksheight));
        System.out.printf("The number of bricks needed to build the wall is: %d", amount);
    }
}
