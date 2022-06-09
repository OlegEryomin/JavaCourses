package com.geekbrains.courses.work10;

public class MyArraySizeException extends Exception{
    private static final String ERROR_MESSAGE = "Размер массива должен быть 4х4";

    public MyArraySizeException() {
        super(ERROR_MESSAGE);
    }
}
