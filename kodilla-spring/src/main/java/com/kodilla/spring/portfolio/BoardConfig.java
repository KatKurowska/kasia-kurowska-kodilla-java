package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean(name = "todo")
    public TaskList getTodo() {
        return new TaskList();
    }

    @Bean(name = "in progress")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean(name = "done")
    public TaskList getDone() {
        return new TaskList();
    }
}

