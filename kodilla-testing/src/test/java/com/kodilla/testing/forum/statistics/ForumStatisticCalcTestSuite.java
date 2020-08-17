package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.doubleThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticCalcTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNData(int dataQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 0; n < dataQuantity; n++){
            String userName = "Jan_Test_" + n;
            resultList.add(userName);
        }
        return resultList;
    }

    @Test
    void testPost0Count() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 0;
        int resultCommentCount = 1000;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(0, averageCommentOfPost);
        assertEquals(10, averageCommentOfUser);
        assertEquals(0, averagePostOfUser);
    }

    @Test
    void testPost1000Count() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 1000;
        int resultCommentCount = 1000;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(1, averageCommentOfPost);
        assertEquals(10, averageCommentOfUser);
        assertEquals(10, averagePostOfUser);
    }

    @Test
    void testComment0Count() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 1000;
        int resultCommentCount = 0;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(0, averageCommentOfPost);
        assertEquals(0, averageCommentOfUser);
        assertEquals(10, averagePostOfUser);
    }

    @Test
    void testCommentOfPostCount() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 1000;
        int resultCommentCount = 76;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(0.076, averageCommentOfPost);
        assertEquals(0.76, averageCommentOfUser);
        assertEquals(10, averagePostOfUser);
    }

    @Test
    void testCommentCountLessPostCount() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 1000;
        int resultCommentCount = 76;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(0.076, averageCommentOfPost);
        assertEquals(0.76, averageCommentOfUser);
        assertEquals(10, averagePostOfUser);
    }

    @Test
    void testCommentCountGreaterPostCount() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 136;
        int resultCommentCount = 254;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(1.8676470588235294, averageCommentOfPost);
        assertEquals(2.54, averageCommentOfUser);
        assertEquals(1.36, averagePostOfUser);
    }

    @Test
    void testUserListNull() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 200;
        int resultCommentCount = 254;
        List<String> resultUserList = generateListOfNData(0);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(1.27, averageCommentOfPost);
        assertEquals(0, averageCommentOfUser);
        assertEquals(0, averagePostOfUser);
    }

    @Test
    void testUserList100Size() {
        //Given
        ForumStatisticCalc forumStatisticCalc = new ForumStatisticCalc();
        int resultPostCount = 200;
        int resultCommentCount = 254;
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentCount);
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);
        //When
        forumStatisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        double averageCommentOfPost = forumStatisticCalc.getAverageCommentsOfPostCount();
        double averageCommentOfUser = forumStatisticCalc.getAverageCommentsOfUserCount();
        double averagePostOfUser = forumStatisticCalc.getAveragePostsOfUserCount();

        //Then
        assertEquals(1.27, averageCommentOfPost);
        assertEquals(2.54, averageCommentOfUser);
        assertEquals(2, averagePostOfUser);
    }



}
