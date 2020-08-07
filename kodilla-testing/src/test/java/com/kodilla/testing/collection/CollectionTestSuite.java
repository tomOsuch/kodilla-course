package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: Begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "when create List numberOdd" + "then List number ist null"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() throws NullPointerException {
        //Give
        List<Integer> numbers = null;
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbersOdd = null;
        //Then
        Assertions.assertEquals(numbersOdd, exterminator.exterminate(numbers));
    }

    @DisplayName(
            "when create List numberOdd" + "then List number ist odd"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Give
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbersOdd = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i %2 != 0) {
                numbersOdd.add(i);
            }
        }
        //Then
        Assertions.assertEquals(numbersOdd, exterminator.exterminate(numbers));
    }
}
