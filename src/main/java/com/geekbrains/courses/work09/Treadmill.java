package com.geekbrains.courses.work09;

public class Treadmill implements Barrier{
    private double distanceMetr;

    public Treadmill(double distanceMetr) {
        this.distanceMetr = distanceMetr;
    }

    public double getDistanceMetr() {
        return distanceMetr;
    }
}
