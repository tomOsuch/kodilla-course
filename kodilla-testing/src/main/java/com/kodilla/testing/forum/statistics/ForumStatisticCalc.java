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

        if (userCount != 0) {
            averageCommentsOfUserCount = (double) commentsCount / userCount;
            averagePostsOfUserCount = (double) postsCount / userCount;
        } else {
            averagePostsOfUserCount = 0;
            averageCommentsOfUserCount = 0;
        }
        if (postsCount != 0) {
            averageCommentsOfPostCount = (double) commentsCount / postsCount;
        }
         else {
            averageCommentsOfPostCount = 0;
        }
    }

}
