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
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowExceptionHandling(numberX, numberY));
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
    void testProbablyIWillDoseNotThrowException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowExceptionHandling(1.5, 3));
    }

}
