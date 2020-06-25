package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

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
            averagePostsPerUser = 0;
        } else {
            averageCommentsPerUser = numberOfComments / (double) numberOfUsers;
            averagePostsPerUser = numberOfPosts / (double) numberOfUsers;
        }
        if (numberOfPosts == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average quantity of posts per user: " + averagePostsPerUser);
        System.out.println("Average quantity of comments per user: " + averageCommentsPerUser);
        System.out.println("Average quantity of comments per post: " + averageCommentsPerPost);

    }
}
