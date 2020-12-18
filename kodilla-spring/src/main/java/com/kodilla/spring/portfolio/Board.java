package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList todo;

    private final TaskList inProgress;

    private final TaskList done;

    public TaskList getTodo() {
        return todo;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDone() {
        return done;
    }

    public Board( TaskList todo, TaskList inProgress, TaskList done) {
        this.todo = todo;
        this.inProgress = inProgress;
        this.done = done;
    }
}
