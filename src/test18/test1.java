package test18;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше самое счастливое число: ");
        int numberUser = sc.nextInt();
        if (numberUser==7 || numberUser==13 || numberUser==24) {
            switch (numberUser) {
                case 7:
                    System.out.println("Это моё тоже счатливое число");
                    break;
                case 13, 24:
                    System.out.println("Это не счатливое число");
                    break;
            }
        }
        else {
            System.out.println("Для вас" + numberUser + "является счастливым числом");
        }
    }
}