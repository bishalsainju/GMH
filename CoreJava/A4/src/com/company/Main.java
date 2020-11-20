package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Car fordCar = new Ford("Ford1234", 4, 2, "2019");
        Car audiCar = new Audi("Audi1234", 4, 4, "2020");
        Car toyotaCar = new Toyota("Toyota1234", 4, 4, "2020");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(fordCar);
        cars.add(audiCar);
        cars.add(toyotaCar);

        for (Car c: cars) {
            c.accelerate();
        }

    }
}

/*
Inheritance achieved by creating 3 subclasses of car, and inheriting
all of the characteristics of super class.
Polymorphism achieved by morphing the Car object when calling for loop to decide
which subclasses's accelerate function to call.
*/