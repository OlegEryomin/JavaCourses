package com.geekbrains.courses.work10;


public class Main {

    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        String[][] arrayOne = new String[4][4];
        arrayOne[0][0] = "1";
        arrayOne[0][1] = "1";
        arrayOne[0][2] = "f";
        arrayOne[0][3] = "1";
        try {
           int sum =  test.manipulationArray(arrayOne);
            System.out.println("Сумма = "  + sum);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

}
