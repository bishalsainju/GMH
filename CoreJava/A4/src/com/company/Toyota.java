package com.company;

public class Toyota extends Car {
    private String model;
    public Toyota(String name, int engine, int doors, String model) {
        super(name, engine, doors);
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota Car accelerated");
    }

    public void turnSpecificFeatureToyota() {
        System.out.println("Special feature of Toyota turned on");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
