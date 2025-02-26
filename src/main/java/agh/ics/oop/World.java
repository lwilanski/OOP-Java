package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;

import agh.ics.oop.model.Vector2d;

public class World {
    public static void main(String[] args) {
        System.out.println("System started");
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));
        run(OptionsParser.parse(args));
        System.out.println("System stopped");
    }

    public static void run(MoveDirection[] directions){
        for (MoveDirection direction : directions) {
            switch (direction){
                case FORWARD -> System.out.println("Swizzy is moving forward");
                case BACKWARD -> System.out.println("Swizzy is moving backward");
                case LEFT -> System.out.println("Swizzy is turning left");
                case RIGHT -> System.out.println("Swizzy is turning right");
            }
        }
    }
}
