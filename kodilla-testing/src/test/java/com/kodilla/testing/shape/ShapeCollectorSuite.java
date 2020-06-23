package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(3.5, 7.7);
        Circle circle = new Circle(5.2);
        //When
        System.out.println("Test of adding shapes to the list.");
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(2, shapeCollector.showFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5.2);
        Square square = new Square(8.6);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        System.out.println("Test of removing shapes from the list.");
        Assert.assertTrue(shapeCollector.showFigures().size() == 2);
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(6.5);
        Circle circle = new Circle(3.3);
        Triangle triangle = new Triangle(5.3, 5.0);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //When
        System.out.println("Test of getting shapes from the list.");
        Shape expectedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(expectedFigure, square);
    }
}





