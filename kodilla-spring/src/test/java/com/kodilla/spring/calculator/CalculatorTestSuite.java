package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(  "com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(30,12);
        double result2 = calculator.sub(65,35);
        double result3 = calculator.mul(4,12);
        double result4 = calculator.div(82,4);
        //Then
        Assert.assertEquals(42, result1, 0.1);
        Assert.assertEquals(30, result2, 0.1);
        Assert.assertEquals(48, result3, 0.1);
        Assert.assertEquals(20.5, result4, 0.1);
    }
}
