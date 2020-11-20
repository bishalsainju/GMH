package com.company;

public class Ford extends Car {
    private String model;
    public Ford(String name, int engine, int doors, String model) {
        super(name, engine, doors);
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("Ford Car accelerated");
    }

    public void turnSpecificFeatureFord() {
        System.out.println("Special feature of Ford turned on");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
