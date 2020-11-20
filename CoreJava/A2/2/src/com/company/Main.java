package com.company;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Simba", "Roar", "Deers");
        Animal deer = new Animal("Joy", "DeerSound", "Grass");
        Animal crow = new Animal("Peto", "Crow", "Insects");

        lion.makeSound(4);
        lion.eat();
        System.out.println();

        deer.makeSound(3);
        deer.eat();
        System.out.println();

        crow.makeSound(2);
        crow.eat();
        System.out.println();
    }
}
