package com.geekbrains.courses.work06;

public class Dog extends Animal{

    private static int countDog;
    public Dog(String name, int age) {
        super(name, age);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    protected void run(int distanceMeters) {
        if (distanceMeters < 500 && distanceMeters > 0) {
            super.run(distanceMeters);
        }else {
            System.out.println("Собаки могут бегать не более 500 метров !!!");
        }

    }

    @Override
    protected void swim(int distanceMeters) {
        if (distanceMeters < 10 && distanceMeters > 0) {
            super.swim(distanceMeters);
        } else {
            System.out.println("Собаки могут плыть не более 10 метров !!!");
        }

    }
}
