package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void getShapeName() {
        System.out.println("The shape is: Circle.");
    }

    @Override
    public double getField() {
        return r * Math.PI;
    }
}
