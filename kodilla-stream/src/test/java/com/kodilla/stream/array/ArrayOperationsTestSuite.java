package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        numbers[0] = 6;
        numbers[1] = 3;
        numbers[2] = 3;
        numbers[3] = 1;
        numbers[4] = 2;
        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3, result);
    }
}
