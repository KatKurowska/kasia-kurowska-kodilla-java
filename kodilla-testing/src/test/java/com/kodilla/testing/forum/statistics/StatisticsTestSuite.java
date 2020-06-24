package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private static int testCounter = 0;
    Statistics statisticsMock;
    StatisticsCalculations statisticsCalculations;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        statisticsMock = mock(Statistics.class);
        statisticsCalculations = new StatisticsCalculations();

        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatistics_numberOfPosts0() {

        //When
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(60);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(15);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 4.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfPosts1000() {

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(8000);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 50.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 400.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 8.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfComments0() {

        //When
        when(statisticsMock.postsCount()).thenReturn(49);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(7);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 7.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfPostsBiggerThanNumberOfComments() {

        //When
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 10.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 2.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 0.2, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfCommentsBiggerThanNumberOfPosts() {

        //When
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.commentsCount()).thenReturn(1200);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 0.6, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 6.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 10.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfUsers0() {

        //When
        when(statisticsMock.postsCount()).thenReturn(19);
        when(statisticsMock.commentsCount()).thenReturn(57);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 3.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfUsers100() {

        //When
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(700);
        List<String> userNamesMock = mock(List.class);
        when(userNamesMock.size()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(userNamesMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculations.getAveragePostsPerUser(), 0.25, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerUser(), 7.0, 0);
        Assert.assertEquals(statisticsCalculations.getAverageCommentsPerPost(), 28.0, 0);
    }
}


