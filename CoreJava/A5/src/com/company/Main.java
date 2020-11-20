package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 2, 3);

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        rect.resize(2);

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}

