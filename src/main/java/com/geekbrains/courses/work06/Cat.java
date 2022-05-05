package com.geekbrains.courses.work06;

public class Cat extends Animal{

    private static int countCat;
    public Cat(String name, int age) {
        super(name, age);
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    protected void run(int distanceMeters) {
        if (distanceMeters < 200 && distanceMeters > 0) {
            super.run(distanceMeters);
        }else {
            System.out.println("Кошки могут бегать не более 200 метров !!!");
        }
    }

    @Override
    protected void swim(int distanceMeters) {
        throw new UnsupportedOperationException( getName() + " is a cat. Cat can not use method swim()!!!");
    }

}
