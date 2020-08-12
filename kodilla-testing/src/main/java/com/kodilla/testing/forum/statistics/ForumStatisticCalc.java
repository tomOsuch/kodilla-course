package com.kodilla.testing.forum.statistics;


import java.util.List;

public class ForumStatisticCalc {

    private double userCount;
    private double postsCount;
    private double commentsCount;
    private double averagePostsOfUserCount;
    private double averageCommentsOfUserCount;
    private double averageCommentsOfPostCount;

    public double getUserCount() {
        return userCount;
    }

    public void setUserCount(double userCount) {
        this.userCount = userCount;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(double postsCount) {
        this.postsCount = postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(double commentsCount) {
        this.commentsCount = commentsCount;
    }

    public double getAveragePostsOfUserCount() {
        return averagePostsOfUserCount;
    }

    public void setAveragePostsOfUserCount(double averagePostsOfUserCount) {
        this.averagePostsOfUserCount = averagePostsOfUserCount;
    }

    public double getAverageCommentsOfUserCount() {
        return averageCommentsOfUserCount;
    }

    public void setAverageCommentsOfUserCount(double averageCommentsOfUserCount) {
        this.averageCommentsOfUserCount = averageCommentsOfUserCount;
    }

    public double getAverageCommentsOfPostCount() {
        return averageCommentsOfPostCount;
    }

    public void setAverageCommentsOfPostCount(double averageCommentsOfPostCount) {
        this.averageCommentsOfPostCount = averageCommentsOfPostCount;
    }

    public int calculateAdvStatisticsUserList(Statistics statistics) {
        return statistics.userName().size();
    }

}
