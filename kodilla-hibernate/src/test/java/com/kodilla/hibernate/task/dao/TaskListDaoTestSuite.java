package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String ListNameToDo = "ToDo";
    private static final String ListNameInProgress = "inProgress";
    private static final String LISTNAME = "Todo";
    private TaskList taskListOne;
    private TaskList taskListTwo;
    private TaskList taskListThird;



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

        taskListDao.deleteAll();
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }
}
