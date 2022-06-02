package com.geekbrains.courses.work09;

public class Main {
    public static void main(String[] args) {
        Entity[] members = {
                new Cat("Barsik", 20, 0.2),
                new Robot("R2406", 500, 3),
                new Human("Andre", 1000, 1.5),
                new Cat("Felix", 10, 0.5)
        };

        Barrier[] barriers = {
                new Wall(1),
                new Treadmill(500),
                new Wall(2)
        };


        for (Entity member : members) {
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall){
                    boolean isJump =  member.jump(((Wall) barrier).getHeightMetr());
                    if (!isJump) {
                        break;
                    }
                }
                if (barrier instanceof Treadmill){
                    boolean isRun =  member.run(((Treadmill) barrier).getDistanceMetr());
                    if (!isRun) {
                        break;
                    }
                }
            }
        }
    }



}
