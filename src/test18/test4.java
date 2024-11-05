package test18;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //Разработать приложение, которое записывать ваши ежемесячные платежи по
        //кредиту за 5 лет. Реализовать консольное меню, через которое мы можем внести
        //расходы за год, вывести сумму сколько осталось заплатить, сколько месяцев
        //выплачивать и сколько мы переплатили за кредит, если ставка 20%. Изначально
        //нужно узнать у пользователя сумму кредита.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму кредита: ");
        int credit = sc.nextInt();

        int months = 60;
        double percentages = 0.2;
        double dolg = credit * percentages + credit;
        double totalPayYear = 0;

        System.out.println("Внесите ежемесячные платежи за год");

        for (int i = 0;i < 12; i++ ) {
            System.out.println("Введите платеж за месяц " + (i + 1) + ": ");
            int payMonth = sc.nextInt();
            totalPayYear += payMonth;
            dolg -= payMonth;
            months--;
        }
        double totalPay = totalPayYear;
        System.out.println("сколько заплатил за все месяцы: " + totalPay);
        System.out.println("сколько осталось заплатить: " + dolg);
        System.out.println("сколько месяцев осталось: " + months);
    }
}