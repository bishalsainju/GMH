package com.company;

public class RtTriangle extends Shape {
    private double height;
    private double width;

    public RtTriangle(int numSides, double height, double width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return .5*this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.height+this.width+Math.sqrt(Math.pow(this.height, 2) +
                Math.pow(this.width, 2)));
    }
}
