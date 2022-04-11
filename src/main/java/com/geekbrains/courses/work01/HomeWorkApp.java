package com.geekbrains.courses.work01;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");

        checkSumSign(5, 5);
    }

    private static void printThreeWords(String fruit) {
        System.out.println(fruit);
    }

    private static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
