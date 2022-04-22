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
        isContextNumber(a);

        System.out.println("Задание 3:");
        System.out.println("Введите целое число:");
        a = sc.nextInt();
        System.out.println(isNegativeNumber(a));

        System.out.println("Задание 4:");
        System.out.println("Введите строку:");
        Scanner sc2 = new Scanner(System.in);
        String s = sc2.nextLine();
        System.out.println("Введите количество раз:");
        a = sc.nextInt();
        printStringCounter(s, a);

        System.out.println("Задание 5:");
        System.out.println("Введите календарный год:");
        a = sc.nextInt();
        isLeapYear(a);


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

    /** Метод печатает в консоль "Положительное" или "Отрицательное"
     * в зависимости от контекста передаваемого параметра
     * @param a целое число
     */
    private static void isContextNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /**
     * @param a целое число
     * @return true если a "Отрицательное"
     */
    private static boolean isNegativeNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /** Метод печатает переданную строку в консоль
     * @param a Количество повторений печати
     * @param s Строка которая будет напечатана
     */
    private static void printStringCounter(String s, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(s);
        }
    }

    /** Метод определения високостного года
     * @param year календарный год
     * @return true если год високостный
     */
    private static boolean isLeapYear(int year) {

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }else {
                return false;
            }
        } else if (year % 4 == 0){
            return true;
        }else {
            return false;
        }

    }
}
