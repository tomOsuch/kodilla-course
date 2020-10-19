package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryDrivingTask() {
        //Given

        //When
        Task drivingTask = factory.createTask(TaskType.DRIVING);
        boolean isTaskResult = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //Then
        assertEquals("driving taxi", drivingTask.getTaskName());
        assertTrue(drivingTask instanceof DrivingTask);
        assertFalse(isTaskResult);
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given

        //When
        Task paintingTask = factory.createTask(TaskType.PAINTING);
        boolean isTaskResult = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //Then
        assertEquals("Painting color", paintingTask.getTaskName());
        assertTrue(paintingTask instanceof PaintingTask);
        assertFalse(isTaskResult);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given

        //When
        Task shoppingTask = factory.createTask(TaskType.SHOPPING);
        boolean isTaskResult = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        //Then
        assertEquals("Zakupy", shoppingTask.getTaskName());
        assertTrue(shoppingTask instanceof ShoppingTask);
        assertFalse(isTaskResult);
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
