package com.company;

abstract public class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}
