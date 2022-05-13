package com.geekbrains.courses.work06;

public abstract class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;
    private static int countAnimal;

    public Animal(String name,  int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countAnimal++;
    }

    /**
     * @param distanceMeters дистанция в метрах
     */
    public void run(int distanceMeters) {
        if (distanceMeters < runLimit && distanceMeters > 0) {
            System.out.println(name + " пробежал(а)" + distanceMeters + "м.");
        }else {
            System.out.println(name + " не может пробежать" + distanceMeters + "м.");
        }
    }

    /**
     * @param distanceMeters дистанция в метрах
     */
    public void swim(int distanceMeters) {
        if (distanceMeters < swimLimit && distanceMeters > 0) {
            System.out.println(name + " проплыл(а) " + distanceMeters + "м.");
        } else {
            System.out.println(name + " не может проплыть " + distanceMeters + "м.");
        }
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
