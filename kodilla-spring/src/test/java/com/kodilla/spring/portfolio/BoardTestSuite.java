package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBoardConditional() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean boardToDo = context.containsBean("todo");
        boolean boardInProg = context.containsBean("inProg");
        boolean boardDone = context.containsBean("done");
        //Then
        System.out.println("todo: " + boardToDo + "; inProg: " + boardInProg + "; done: " + boardDone);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board boardTodo = context.getBean(Board.class);
        Board boardInProg = context.getBean(Board.class);
        Board boardDone = context.getBean(Board.class);
        //When
        boardTodo.setToDoList(new TaskList(List.of("test1", "test2")));
        boardInProg.setInProgressList(new TaskList(List.of("test1 in Progres", "test2 in Progres")));
        boardDone.setDoneList(new TaskList(List.of("done1", "done2", "done3")));
        //Then
        System.out.println(boardTodo.getToDoList().getTasks());
        System.out.println(boardInProg.getInProgressList().getTasks());
        System.out.println(boardDone.getDoneList().getTasks());
    }


}
