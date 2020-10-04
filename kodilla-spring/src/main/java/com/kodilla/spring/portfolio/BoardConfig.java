package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("tasks1")
    TaskList tasks;

    @Bean
    public TaskList getTasks () {
        return tasks = new TaskList();
    }

    @Bean(name = "tasks1")
    @Scope("prototype")
    public Board getToDoList() {

    }
}
