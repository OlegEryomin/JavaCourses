package com.geekbrains.courses.work09;

public class Human implements Entity{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Human " + this.name + " run");
    }

    @Override
    public void jump() {
        System.out.println("Human " + this.name + " jump");
    }
}
