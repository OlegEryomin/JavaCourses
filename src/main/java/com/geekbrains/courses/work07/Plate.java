package com.geekbrains.courses.work07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food <= 0){
            System.out.println("В тарелке закончилась еда");
        }else {
            if (food < n) {
                int remainder = n - food;
                System.out.println("Съедено: " + food + " еды, нехватило " + remainder);
                food = 0;
            }else {
                food = food - n;
            }
        }

    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

}
