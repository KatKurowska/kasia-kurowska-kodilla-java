package com.kodilla.stream.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testGetAverage() {
        //Prepare array with sample int values and process getAverage(int [] numbers)
        //Given
        int[] sampleNumbers = new int[]{7, 15, 39, 28, 131, 49, 3, 0, 27, 102, 87, 59, 13, 195, 17, 25, 65, 189, 39, 12};
        //When
        double result = ArrayOperations.getAverage(sampleNumbers);
        System.out.println("Elements of array: " + sampleNumbers.length);
        //Check if average is correct
        //Then
        Assert.assertEquals(result, 55.1, 0.1);
    }
}
