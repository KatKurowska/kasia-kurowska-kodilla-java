package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {
    @Qualifier("todo")
    @Autowired
    private TaskList todo;
    @Qualifier("in progress")
    @Autowired
    private TaskList inProgress;
    @Qualifier("done")
    @Autowired
    private TaskList done;

    public TaskList getTodo() {
        return todo;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDone() {
        return done;
    }

    public Board(TaskList todo, TaskList inProgress, TaskList done) {
    }
}
