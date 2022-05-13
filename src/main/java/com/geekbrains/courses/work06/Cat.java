package com.geekbrains.courses.work06;

public class Cat extends Animal{

    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;
    private static int countCat;

    public Cat(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        countCat++;
    }


    public static int getCountCat() {
        return countCat;
    }


    @Override
    public void swim(int distanceMeters) {
        System.out.println( getName() + " утонул(а) :(");
    }

}
