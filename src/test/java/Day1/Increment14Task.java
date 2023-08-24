package Day1;

public class Increment14Task {
    public static void main(String[] args) {
        int hour=11;
        int minute=59;
        int seconds=57;
        ++seconds;
        System.out.println(hour + ":" + minute + ":" + seconds + " PM");
        ++seconds;
        System.out.println(hour + ":" + minute  + ":" + seconds  + " PM");
        ++hour;
        seconds = 0;
        minute = 0;
        System.out.printf("%d:%02d:%02d AM", hour, minute, seconds);
        System.out.println("\nHappy New Year! Let's make this year our best year yet. Let's set goals that scare us, take massive action towards them, and refuse to settle for anything less than our absolute best. Remember, success is your duty, your obligation, and your responsibility. Let's dominate our goals and make this year one for the record books. Let's do whatever it takes to make it happen!");


    }
}
