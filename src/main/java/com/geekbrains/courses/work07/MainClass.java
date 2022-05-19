package com.geekbrains.courses.work07;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 200);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
