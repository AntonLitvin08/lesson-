package com.javarush.task.task14.task1411;

public interface Person {
    class User implements com.javarush.task.task14.task1411.Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements com.javarush.task.task14.task1411.Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements com.javarush.task.task14.task1411.Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements com.javarush.task.task14.task1411.Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }

}
