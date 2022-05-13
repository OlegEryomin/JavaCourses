package com.geekbrains.courses.work06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Dog("Шарик"),
                new Dog("Бобик")
        };

        final Random random = new Random();
        for (Animal animal : animals) {
            int randomRunDistanceMeter = random.nextInt(600);
            int randomSwimDistanceMeter = random.nextInt(20);
            animal.run(randomRunDistanceMeter);
            animal.swim(randomSwimDistanceMeter);
        }

        System.out.println("Количество собак - " + Dog.getCountDog());
        System.out.println("Количество кошек - " + Cat.getCountCat());
        System.out.println("Всего животных - "   + Animal.getCountAnimal());
    }
}
