package com.kodilla.testing.forum.statistics;


public class ForumStatisticCalc {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsOfUserCount;
    private double averageCommentsOfUserCount;
    private double averageCommentsOfPostCount;

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsOfUserCount() {
        return averagePostsOfUserCount;
    }

    public double getAverageCommentsOfUserCount() {
        return averageCommentsOfUserCount;
    }

    public double getAverageCommentsOfPostCount() {
        return averageCommentsOfPostCount;
    }

    public void calculateAdvStatisticsUserList(Statistics statistics) {

        userCount = statistics.userName().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (statistics.userName().size() != 0) {
            averageCommentsOfUserCount = (double) statistics.commentsCount() / statistics.userName().size();
            averagePostsOfUserCount = (double) statistics.postsCount() / statistics.userName().size();
        } else {
            averagePostsOfUserCount = 0;
            averageCommentsOfUserCount = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsOfPostCount = (double) statistics.commentsCount() / statistics.postsCount();
        }
         else {
            averageCommentsOfPostCount = 0;
        }
    }

}
