package com.company;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }

    @Override
    public void resize(double x) {
        this.height = x*this.height;
        this.width = x*this.width;
    }
}
