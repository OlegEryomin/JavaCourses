package com.geekbrains.courses.work10;

public class ArrayTest {

    public int manipulationArray(String[][] array) throws MyArraySizeException {
        int sum = 0;
        if (array.length == 4 || array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum = sum + Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            System.out.println("Все в порядке!");
        } else {
            throw new MyArraySizeException();
        }

        return sum;
    }

}
