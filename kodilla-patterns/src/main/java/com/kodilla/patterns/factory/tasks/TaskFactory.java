package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String shapeClass) {
        switch (shapeClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Home", "Car");
            case PAINTING:
                return new PaintingTask("Painting", "red","living room");
            case SHOPPING:
                return new ShoppingTask("Shopping","T-SHIRT", 1 );
            default:
                return null;
        }

    }
}
