package com.geekbrains.courses.work06;

public abstract class Animal {
    private String name;
    private int age;
    private static int countAnimal;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        countAnimal++;
    }

    protected void run(int distanceMeters) {
        System.out.println(this.name + " пробежал(а)" + distanceMeters + "м.");
    }

    protected void swim(int distanceMeters) {
        System.out.println(this.name + " проплыл(а) " + distanceMeters + "м.");
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
