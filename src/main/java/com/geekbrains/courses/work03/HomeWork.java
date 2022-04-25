package com.geekbrains.courses.work03;

public class HomeWork {

    public static void main(String[] args) {


        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        array = replacement(array);

        int[] arrayTwo = fellingInOrder(10);

        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayThree = replacementLessSix(arrayThree);

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
        }
        return array;
    }
}
