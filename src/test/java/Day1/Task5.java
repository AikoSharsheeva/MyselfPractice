package Day1;

public class Task5 {
    public static void main(String[] args) {
        String firstName="Elon";
        String lastName="Musk";
        System.out.println(createInitials(firstName,lastName));
    }
    public static String createInitials(String firstName, String lastName){
        String firstInitial = String.valueOf(firstName.charAt(0));
        String lastInitial = String.valueOf(lastName.charAt(0));
        return firstInitial.concat(lastInitial);
    }
}
