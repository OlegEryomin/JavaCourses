package com.geekbrains.courses.work07;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        int food = p.getFood();
        if (food <= 0) {
            System.out.println("Кричать возле миски, требуя еду.");
            satiety = false;
        } else {
            if (food < appetite){
                p.decreaseFood(food);
                appetite = appetite - food;
                satiety = false;
                System.out.println("Седено " + food + " еды, требовать еще " + appetite + " еды");
            } else {
                p.decreaseFood(appetite);
                satiety = true;
            }

        }


    }

}
