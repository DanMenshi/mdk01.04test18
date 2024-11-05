package test18;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String array[] = new String[50];

        System.out.println("1. Ввести планы на день ");
        System.out.println("2. Посмотреть планы на день");
        int checkValue = sc.nextInt();

        if (checkValue == 1) {
            for (int i = 0; i <= array.length; i++) {
                System.out.println("Вводите: ");
                array[i] = sc.next();

                System.out.println("Продолжаем?");
                System.out.println("1. Да");
                System.out.println("2. Нет");

                int checkValueReturn = sc.nextInt();

                if (checkValueReturn==2){
                    break;
                }
            }
        }
        System.out.println("Расписание на день: " + Arrays.toString(array));
    }
}