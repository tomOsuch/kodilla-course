package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    private final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryDrivingTask() {
        //Given

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("driving taxi", drivingTask.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting color", paintingTask.getTaskName());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Zakupy", shoppingTask.getTaskName());
    }
}
