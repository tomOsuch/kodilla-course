package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {

    @ParameterizedTest
    @MethodSource("data")
    void testProbablyIWillThrowException(double numberX, double numberY) {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(numberX, numberY));
    }

    public static Stream data() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(0, 2),
                Arguments.of(4, 1.5),
                Arguments.of(2, 1.5),
                Arguments.of(2, 1.5),
                Arguments.of(0, 1.5)
        );
    }

    @Test
    void testReturnValueProbablyIWillThrowException() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        String result = secondChallenge.probablyIWillThrowException(1.5, 3);
        //Then
        assertEquals("Done!", result);
    }

}
