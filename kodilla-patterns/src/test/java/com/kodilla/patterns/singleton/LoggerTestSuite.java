package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void getLogger() {
        logger = Logger.LOG_INSTANCE;
        logger.log("Last log: ");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String resultLog = logger.getLastLog();
        //Then
        assertEquals("Last log: ", resultLog);
    }
}
