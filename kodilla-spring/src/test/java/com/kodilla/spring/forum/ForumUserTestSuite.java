package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ForumUserTestSuite {
    @Test
    public void testUsernameLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(  "com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String nameOfUser = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", nameOfUser);
    }
}
