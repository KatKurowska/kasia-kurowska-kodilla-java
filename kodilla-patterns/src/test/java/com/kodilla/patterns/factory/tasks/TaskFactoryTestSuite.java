package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.factory.tasks.TaskFactory.*;

public class TaskFactoryTestSuite {

    @Test
    public void testExecutedDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.createTask(DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    public void testExecutedPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.createTask(PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testExecutedShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.createTask(SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
