package com.geekbrains.courses.work10;

public class MyArrayDataException extends NumberFormatException{
    private static final String ERROR_MESSAGE = "Массив содержит недопустимые символы";

    public MyArrayDataException(int line, int column) {
        super(ERROR_MESSAGE + " элемент [" + line + "][" + column + "]");
    }
}
