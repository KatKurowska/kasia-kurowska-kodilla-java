package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> listOfShapes = new ArrayList();

    void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public ArrayList<Shape> showFigures() {
        return listOfShapes;
    }
}
