package Day1;

import java.util.Scanner;

public class NestedIF26task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер из вариантов" + "\n" + "1.Главное меню" + "\n" +
                "2. Закуски");

        String select = sc.nextLine();

        if (select.equalsIgnoreCase("1")) { // ПЕРВАЯ ЧАСТЬ
            System.out.println("Выбери блюдо" + "\n" + "1.Лагман" + "\n" +
                    "2. Бургер");
            String main = sc.nextLine();
            if (main.equalsIgnoreCase("1")) {
                System.out.println("Ваш выбор лагман");
            } else if (main.equalsIgnoreCase("2")) {
                System.out.println("Ваш выбор бургер");
            } else {
                System.out.println("Error");
            }
        } else if (select.equalsIgnoreCase("2")) { //ВТОРАЯ ЧАСТЬ!!!!!
            System.out.println("Выберите закуску" + "\n" + "1.Степ-ролл" + "\n" +
                    "2.Цезарь");
            String salad = sc.nextLine();
            if (salad.equalsIgnoreCase("1")) {
                System.out.println("Ваш выбор степ-ролл");

            } else if (salad.equalsIgnoreCase("2")) {
                System.out.println("Ваш выбор цезарь");
            } else {
                System.out.println("Invalid");
            }

        }
    }
}


