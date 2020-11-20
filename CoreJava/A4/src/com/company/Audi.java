package com.company;

public class Audi extends Car {
    private String model;
    public Audi(String name, int engine, int doors, String model) {
        super(name, engine, doors);
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("Audi Car accelerated");
    }

    public void turnSpecificFeatureAudi() {
        System.out.println("Special feature of Audi turned on");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
