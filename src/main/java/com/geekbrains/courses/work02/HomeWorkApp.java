package com.geekbrains.courses.work02;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println(isSumLimitTenBeforeTwenty(a, b));

        System.out.println("Задание 2:");
        System.out.println("Введите целое число:");
        a = sc.nextInt();
        System.out.println(isContextNumber(a));


    }

    /**
     * @param a первое целое число
     * @param b второе целое число
     * @return true если сумма a и b лежит в пределах от 10 до 20 (включительно)
     */
    private static boolean isSumLimitTenBeforeTwenty(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }  else {
            return false;
        }
    }

    /**
     * @param a целое число
     * @return String если a "Положительное" или "Отрицательное"
     */
    private static String isContextNumber(int a) {
        if (a >= 0) {
            return "Положительное";
        } else {
            return "Отрицательное";
        }
    }
}
