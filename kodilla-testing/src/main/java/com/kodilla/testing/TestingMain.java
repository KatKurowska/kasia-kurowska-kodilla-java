package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addingResult = calculator.add(42, 191);

        if (addingResult == 233) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractionResult = calculator.subtract(155, 4);

        if (subtractionResult == 151) {
            System.out.println("Subtraction test OK");
        } else {
            System.out.println("Error!");
        }
    }
}