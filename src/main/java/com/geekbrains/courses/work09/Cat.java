package com.geekbrains.courses.work09;

public class Cat implements Entity{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Сat " + this.name + " run");
    }

    @Override
    public void jump() {
        System.out.println("Сat " + this.name + " jump");
    }
}
