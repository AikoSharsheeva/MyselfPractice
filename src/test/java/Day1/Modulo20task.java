package Day1;

public class Modulo20task {
    public static void main(String[] args) {
        int originalBattaryCapacity=100;
        int batterySpent=85;
        int remainingBatteryLife=originalBattaryCapacity%batterySpent;
        System.out.println("The remaining battery life is: " + remainingBatteryLife +"%");
    }
}

