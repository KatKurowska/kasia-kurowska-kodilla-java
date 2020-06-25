package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private static int testCounter = 0;
    Statistics statisticsMock;
    StatisticsCalculator statisticsCalculator;

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
        statisticsCalculator = new StatisticsCalculator();

        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatistics_numberOfPosts0() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(60);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(15));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 4.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfPosts1000() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(8000);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(20));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 50.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 400.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 8.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfComments0() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(49);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(7));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 7.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfPostsBiggerThanNumberOfComments() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(10));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 10.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 2.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 0.2, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfCommentsBiggerThanNumberOfPosts() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.commentsCount()).thenReturn(1200);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(200));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 0.6, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 6.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 10.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfUsers0() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(19);
        when(statisticsMock.commentsCount()).thenReturn(57);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 3.0, 0);
    }

    @Test
    public void calculateAdvStatistics_numberOfUsers100() {

        //When
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(700);
        when(statisticsMock.usersNames()).thenReturn(generateSampleUsers(100));
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCalculator.getAveragePostsPerUser(), 0.25, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerUser(), 7.0, 0);
        Assert.assertEquals(statisticsCalculator.getAverageCommentsPerPost(), 28.0, 0);
    }

    private List<String> generateSampleUsers(int count) {
        List<String> usersNames = new ArrayList<>();
        for (int n = 0; n < count; n++) {
            usersNames.add("User_Name");
        }
        return usersNames;

    }
}


