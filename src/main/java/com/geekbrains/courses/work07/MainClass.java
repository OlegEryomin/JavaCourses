package com.geekbrains.courses.work07;

public class MainClass {
    public static void main(String[] args) {

        Plate plate = new Plate(100);

        Cat[] cats = {
          new Cat("Barsik", 20),
          new Cat("Felix",  50),
          new Cat("Murzik", 40)
        };

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            System.out.println("Satiety " + cat.getName() + " " + cat.isSatiety());
            plate.info();
        }

    }
}
