package com.geekbrains.courses.work09;

public class Cat implements Entity{
    private String name;
    private double runLimit;
    private double jumpLimit;

    public Cat(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(double distanceMetr) {
        if (distanceMetr <= runLimit) {
            System.out.println("Сat " + this.name + " run");
            return true;
        } else {
            System.out.println( this.name + " impossible run");
            return false;
        }

    }

    @Override
    public boolean jump(double heightMetr) {
        if (heightMetr <= jumpLimit) {
            System.out.println("Сat " + this.name + " jump");
            return true;
        } else {
            System.out.println( this.name + " impossible jump");
            return false;
        }
    }
}
