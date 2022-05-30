package com.geekbrains.courses.work09;

public class Main {
    public static void main(String[] args) {
        Entity[] members = {
                new Cat("Barsik"),
                new Robot("R2406"),
                new Human("Andre"),
                new Cat("Felix")
        };

        Barrier[] barriers = {
                new Wall(),
                new Treadmill(),
                new Wall()
        };

        for (Barrier barrier : barriers) {
            for (Entity member : members) {
               if (barrier instanceof Wall){
                   member.jump();
               }else {
                   member.run();
               }
            }
        }

    }



}
