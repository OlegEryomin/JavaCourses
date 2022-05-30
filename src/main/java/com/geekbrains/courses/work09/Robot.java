package com.geekbrains.courses.work09;

public class Robot implements Entity{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " run");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " jump");
    }
}
