package agh.ics.oop;

import agh.ics.oop.model.MoveDirection;

import agh.ics.oop.OptionsParser;

public class World {
    public static void main(String[] args) {
        System.out.println("System started");
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
