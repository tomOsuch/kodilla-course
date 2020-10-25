package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String ListNameToDo = "ToDo";
    private static final String ListNameInProgress = "inProgress";
    private TaskList taskListOne;
    private TaskList taskListTwo;
    private TaskList taskListThird;

    @AfterEach
    public void cleanDao() {
        taskListDao.delete(taskListOne);
        taskListDao.delete(taskListTwo);
    }

    @Test
    void testTaskListDaoSave() {
        //Given
        taskListOne = new TaskList(ListNameToDo,"Task list description one test");
        taskListTwo = new TaskList(ListNameInProgress, "Task list description two test");
        taskListThird = new TaskList(ListNameToDo, "Task list ToDo");
        //When
        taskListDao.save(taskListOne);
        taskListDao.save(taskListTwo);
        taskListDao.save(taskListThird);
        List<TaskList> readTaskListToDo = taskListDao.findByListName(ListNameToDo);
        List<TaskList> readTaskListInProgress = taskListDao.findByListName(ListNameInProgress);
        //Then
        assertEquals(2, readTaskListToDo.size());
        assertEquals(1, readTaskListInProgress.size());
        assertEquals("Task list description one test", readTaskListToDo.get(0).getDescription());
        assertEquals("Task list ToDo", readTaskListToDo.get(1).getDescription());
        assertEquals(ListNameInProgress, readTaskListInProgress.get(0).getListName());
    }
}
