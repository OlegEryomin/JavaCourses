package com.geekbrains.courses.work01;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");

        checkSumSign(5, 5);

        printColor(100);

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

    private static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}
