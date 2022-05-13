package com.geekbrains.courses.work06;

public class Dog extends Animal{

    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int countDog;

    public Dog(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

}
