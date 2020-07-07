package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    //using IntStream and range() display array elements
    //using other IntStream and range() and average() count the average
    //return the average as double

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(number -> System.out.println(numbers[number]));
        IntStream.range(0, numbers.length);
        OptionalDouble averageNumber = IntStream.range(0,numbers.length)
        .map(number -> numbers[number])
        .average();
        return averageNumber.getAsDouble();
    }
}

