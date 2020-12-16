package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
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

    @Bean
    public Board board (@Qualifier("todo") TaskList todo, @Qualifier("in progress") TaskList inProgress, @Qualifier ("done") TaskList done){
        return new Board (todo, inProgress, done);
    }
}

