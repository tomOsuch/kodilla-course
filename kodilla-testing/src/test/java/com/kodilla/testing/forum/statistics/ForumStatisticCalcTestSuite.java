package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;




import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class ForumStatisticCalcTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNData(int dataQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= dataQuantity; n++){
            String userName = "Jan_Test_" + n;
            resultList.add(userName);
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatistics0User() {
        //Given
        ForumStatisticCalc statisticCalc = new ForumStatisticCalc();
        List<String> resultUserList = generateListOfNData(0);
         when(statisticsMock.userName()).thenReturn(resultUserList);
        //When
        int theUserListSize = statisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        //Then
        assertEquals(0, theUserListSize);

    }

    @Test
    void testCalculateAdvStatistics100User() {
        //Given
        ForumStatisticCalc statisticCalc = new ForumStatisticCalc();
        List<String> resultUserList = generateListOfNData(100);
        when(statisticsMock.userName()).thenReturn(resultUserList);
        //When
        int theUserListSize = statisticCalc.calculateAdvStatisticsUserList(statisticsMock);
        //Then
        assertEquals(100, theUserListSize);

    }


}
