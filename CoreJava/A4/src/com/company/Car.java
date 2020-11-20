package com.company;

public class Car {
    private String name;
    private int engine;
    private int doors;
    private int wheels;

    public Car(String name, int engine, int doors) {
        this.name = name;
        this.engine = engine;
        this.doors = doors;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Engine Started");
    }

    public void accelerate() {
        System.out.println("Car Accelerated");
    }

    public void brake() {
        System.out.println("Brake Pressed");
    }

    public void steerRight() {
        System.out.println("Steered Right");
    }

    public void steerLeft() {
        System.out.println("Steered Left");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }





}
