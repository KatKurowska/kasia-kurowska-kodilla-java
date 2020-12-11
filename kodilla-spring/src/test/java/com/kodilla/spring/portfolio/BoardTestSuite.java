package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    ApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(Board.class, BoardConfig.class);
    }

    @Test
    public void testTaskAdd() {
        TaskList todo = (TaskList) context.getBean("todo");
        List<String> todoTasks = todo.getTasks();
        todoTasks.add("todo task");
        todo = (TaskList) context.getBean("todo");
        Assert.assertEquals("todo task", todo.getTasks().get(0));

        TaskList inProgress = (TaskList) context.getBean("in progress");
        List<String> inProgressTasks = inProgress.getTasks();
        inProgressTasks.add("in progress task");
        Assert.assertEquals("in progress task", inProgress.getTasks().get(0));

        TaskList done = (TaskList) context.getBean("done");
        List<String> doneTasks = done.getTasks();
        doneTasks.add("done task");
        done = (TaskList) context.getBean("done");
        Assert.assertEquals("done task", done.getTasks().get(0));
    }

    @Test
    public void testTaskAdd2() {
        Board board = context.getBean(Board.class);

        TaskList todo = board.getTodo();
        List<String> todoTasks = todo.getTasks();
        todoTasks.add("todo task");
        Assert.assertEquals("todo task", board.getTodo().getTasks().get(0));

        TaskList inProgress = board.getInProgress();
        List<String> inProgressTasks = inProgress.getTasks();
        inProgressTasks.add("in progress task");
        Assert.assertEquals("in progress task", board.getInProgress().getTasks().get(0));

        TaskList done = board.getDone();
        List<String> doneTasks = done.getTasks();
        doneTasks.add("done task");
        Assert.assertEquals("done task", board.getDone().getTasks().get(0));

    }
}
