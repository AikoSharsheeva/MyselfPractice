package Day1;

public class StringConcat19task {
    public static void main(String[] args) {
        String productName = "Notebook";
        String quantity = "2";
        String price = "1500.0";
        String totalAmount = ("Invoice for: " + productName +
                "\n" + "Quantity: " + quantity +
                "\n" + "Price: $" + price +
                "\n" + "Total: $3000.0");
        System.out.println(totalAmount);
    }
}