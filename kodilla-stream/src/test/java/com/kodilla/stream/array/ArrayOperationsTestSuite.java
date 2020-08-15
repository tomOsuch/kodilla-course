package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {6, 3, 3, 1, 1};
        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(2.8, result);
    }
}
