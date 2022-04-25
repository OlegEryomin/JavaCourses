package com.geekbrains.courses.work03;

public class HomeWork {

    public static void main(String[] args) {


        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        array = replacement(array);


    }

    /** Метод производит замену эллементов массива с 0 на 1 и наоборот
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
}
