package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.LOG_INSTANCE;
        logger.log("Last log: ");
        //When
        String resultLog = logger.getLastLog();
        //Then
        assertEquals("Last log: ", resultLog);
    }
}
