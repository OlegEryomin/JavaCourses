package com.geekbrains.courses.work06;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик", 5);
        catBarsik.run(50);
       // catBarsik.swim(2);

        Dog dogSharik = new Dog("Шарик", 10);
        dogSharik.run(50);
        dogSharik.swim(2);

        Dog dogHotdog = new Dog("Хотдог", 10);
        dogHotdog.run(500);
        dogHotdog.swim(500);


        System.out.println("Количество собак - " + Dog.getCountDog());
        System.out.println("Количество кошек - " + Cat.getCountCat());
        System.out.println("Всего животных - "   + Animal.getCountAnimal());
    }
}
