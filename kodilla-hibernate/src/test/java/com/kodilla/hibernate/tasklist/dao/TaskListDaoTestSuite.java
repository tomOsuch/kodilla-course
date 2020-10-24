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
    private static final String LIST_ToDo = "ToDo";
    private static final String LIST_inProgress = "inProgress";
    private TaskList taskListOne;
    private TaskList taskListTwo;

    @AfterEach
    public void cleanDao() {
        taskListDao.delete(taskListOne);
        taskListDao.delete(taskListTwo);
    }

    @Test
    void testTaskListDaoSave() {
        //Given
        taskListOne = new TaskList(LIST_ToDo,"Task list description one test");
        taskListTwo = new TaskList(LIST_inProgress, "Task list description two test");
        //When
        taskListDao.save(taskListOne);
        taskListDao.save(taskListTwo);
        List<TaskList> readTaskListToDo = taskListDao.findByListName(LIST_ToDo);
        List<TaskList> readTaskListInProgress = taskListDao.findByListName(LIST_inProgress);
        //Then
        assertEquals(1, readTaskListToDo.size());
        assertEquals(1, readTaskListInProgress.size());
        assertEquals(LIST_ToDo, readTaskListToDo.get(0).getListName());
        assertEquals(LIST_inProgress, readTaskListInProgress.get(0).getListName());
    }


}
