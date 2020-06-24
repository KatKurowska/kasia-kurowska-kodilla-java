package com.kodilla.testing.forum.statistics;

public class StatisticsCalculations {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();


        if (numberOfUsers == 0) {
            averageCommentsPerUser = 0;
            averagePostsPerUser=0;
        } else {
            averageCommentsPerUser = numberOfComments / (double)numberOfUsers;
            averagePostsPerUser=numberOfPosts/(double)numberOfUsers;
        }
        if (numberOfPosts == 0) {
            averageCommentsPerPost = 0;
        }
        else {
            averageCommentsPerPost =  numberOfComments/(double)numberOfPosts;
        }


    }


    public void ShowStatistics() {
        //wyświetla statystyki
    }
}
