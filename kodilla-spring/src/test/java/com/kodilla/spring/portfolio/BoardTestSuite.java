package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        System.out.println("-- Beans list: --");
        List<String> beanListResult = Arrays.stream(context.getBeanDefinitionNames())
                .collect(Collectors.toList());
        //Then
        Assertions.assertTrue(beanListResult.contains("todo"));
        Assertions.assertTrue(beanListResult.contains("inProg"));
        Assertions.assertTrue(beanListResult.contains("done"));

    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("ToDo");
        board.getInProgressList().getTasks().add("inProg");
        board.getDoneList().getTasks().add("done");
        //When
        String toDoResult = board.getToDoList().getTasks().get(0);
        String inProgResult = board.getInProgressList().getTasks().get(0);
        String doneResult = board.getDoneList().getTasks().get(0);
        //Then
        assertEquals(toDoResult, "ToDo");
        assertEquals(inProgResult, "inProg");
        assertEquals(doneResult, "done");
    }


}
