package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard(TaskList todo, TaskList inProg, TaskList done) {
        return new Board(todo, inProg, done);
    }

    @Bean
    @Scope("prototype")
    public TaskList todo() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList inProg() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList done() {
        return new TaskList();
    }

}
