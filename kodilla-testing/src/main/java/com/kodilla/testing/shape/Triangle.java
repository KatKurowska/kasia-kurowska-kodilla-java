package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public void getShapeName(){
        System.out.println("The shape is: Triangle.");
    }

    public double getField() {
        return 0.5*a*h;
    }
}
