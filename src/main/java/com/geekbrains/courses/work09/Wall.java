package com.geekbrains.courses.work09;

public class Wall implements Barrier{
    private double heightMetr;

    public Wall(double heightMetr) {
        this.heightMetr = heightMetr;
    }

    public double getHeightMetr() {
        return heightMetr;
    }
}
