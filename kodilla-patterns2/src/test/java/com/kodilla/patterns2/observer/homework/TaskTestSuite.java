package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTestSuite {

    @Test
    public void testNotifyAboutNewTask() {
        //Given
        Mentor adamMentor = new Mentor("Adam");
        Mentor janMentor = new Mentor("Jan");
        TraineeTasks alexTask = new TraineeTasks(new Trainee("Alex"));
        TraineeTasks alaTask = new TraineeTasks(new Trainee("Ala"));
        TraineeTasks tomasTask = new TraineeTasks(new Trainee("Tomas"));

        alexTask.registerObserver(adamMentor);
        alaTask.registerObserver(adamMentor);
        tomasTask.registerObserver(janMentor);
        //When
        alexTask.addTaskToQueue("Task_1");
        alaTask.addTaskToQueue("Task_2");
        alexTask.addTaskToQueue("Task_3");
        alexTask.addTaskToQueue("Task_4");
        tomasTask.addTaskToQueue("Task_5");
        alaTask.addTaskToQueue("Task_6");
        tomasTask.addTaskToQueue("Task_7");
        //Then
        assertEquals(2, alaTask.getTasks().size());
        assertEquals(2, tomasTask.getTasks().size());
        assertEquals(3, alexTask.getTasks().size());
        assertEquals(5, adamMentor.getUpdateCount());
        assertEquals(2, janMentor.getUpdateCount());
    }
}
