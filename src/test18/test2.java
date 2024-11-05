package test18;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int valueRandom =(int) (Math.random()*10)+1;
        //System.out.println("рандом: " + valueRandom);
        Scanner sc =new Scanner(System.in);
        int attempts = 3;
        System.out.println("Вы космонавт и летите вокруг земли. Угадйате код запуска(1-10) чтобы вернтуься обратно на землю. У вас 3 попытки");
        while (attempts !=0) {
            System.out.println("Осталось попыток: "+attempts+". Код запуска: ");
            int valueUser = sc.nextInt();
            if (valueUser==valueRandom){
                System.out.println("Вы угадали! Летим на землю!");
                break;
            }
            else {
                System.out.println("не верно");
                attempts--;
            }
        }

    }
}