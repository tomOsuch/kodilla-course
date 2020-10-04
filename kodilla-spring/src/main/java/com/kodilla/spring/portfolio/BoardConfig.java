package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todo")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProg")
    TaskList inProgList;

    @Autowired
    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgList, doneList);
    }

    @Bean(name = "todo")
    @Scope("prototype")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProg")
    @Scope("prototype")
    public TaskList createInProgList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList createDoneList() {
        return new TaskList();
    }

}
