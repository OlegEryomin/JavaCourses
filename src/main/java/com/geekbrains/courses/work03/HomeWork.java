package com.geekbrains.courses.work03;

public class HomeWork {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        array = replacement(array);
        System.out.println();

        System.out.println("Задание 2");
        int[] arrayTwo = fellingInOrder(10);
        System.out.println();

        System.out.println("Задание 3");
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayThree = replacementLessSix(arrayThree);
        System.out.println();

        System.out.println("Задание 4");
        int[][] arrayFour = diagonalFilling(5);

    }

    /** Метод производит замену элементов массива с 0 на 1 и наоборот
     * @param array Массив нулей и едениц
     * @return Массив с заменой 0 на 1 и наоборот
     */
    private static int[] replacement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print("[" + array[i] + "] ");
        }
        return array;
    }

    /**
     *
     * @param size Размерность массива
     * @return Целочисленный массив заполненный цифрами по порядку
     */
    private static int[] fellingInOrder(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print("[" + array[i] + "] ");
        }

        return array;
    }

    /** Метод умножает на 2 если элемент массива меньше 6
     * @param array Целочисленный массив
     * @return исходный массив с заменой всех элементов меньше 6
     */
    private static int[] replacementLessSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (current < 6) {
                array[i] = current * 2;
            }
            System.out.print("[" + array[i] + "] ");
        }
        return array;
    }

    /**
     * @param size Размерность массива
     * @return Квадратный двумерный целочисленный массив с заполненными диагональными элементами
     */
    private static int[][] diagonalFilling(int size) {
        int[][] array = new int[size][size];

        int diagTwo = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (j == diagTwo) {
                    array[i][j] = 1;
                }
                System.out.print("[" + array[i][j] + "] ");
            }
            diagTwo--;
            System.out.println();
        }

        return array;
    }
}
