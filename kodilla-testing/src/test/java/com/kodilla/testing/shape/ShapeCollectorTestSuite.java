package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Nested
    @DisplayName("Test Circle")
    class CircleTest{

        @BeforeEach
        public void  beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test " + testCounter );
        }

        @Test
        void testAddFigure() {
            //Give
            Circle circle = new Circle("Circle", 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle", 3);
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            // Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(null, shapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle" , 3);
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedCircle = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, retrievedCircle);
        }

        @Test
        void testShowFigure() {
            //Give
            Circle circle = new Circle("Circle", 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            //When
            String show = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals("Circle", show);
        }
    }

    @Nested
    @DisplayName("Test Square")
    class SquareTest {

        @BeforeEach
        public void  beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test " + testCounter );
        }

        @Test
        void testAddFigure() {
            //Give
            Square square = new Square("Square", 2);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            shapeCollector.addFigure(square);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(null, shapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            shapeCollector.addFigure(square);
            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);
            Shape squareGetSeven = shapeCollector.getFigure(7);
            //Then
            Assertions.assertEquals(square, retrievedSquare);
            Assertions.assertEquals(null, squareGetSeven);
        }

        @Test
        void testShowFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            shapeCollector.addFigure(square);
            //When
            String show = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals("Square", show);
        }
    }

    @Nested
    @DisplayName("Test Triangle")
    class TriangleTest {

        @BeforeEach
        public void  beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test " + testCounter );
        }

        @Test
        void testAddFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(triangle);
            //Then
            Assertions.assertEquals(triangle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(null, shapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            Shape retrievedTriangle = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, retrievedTriangle);
        }

        @Test
        void testShowFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            String show = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals("Triangle", show);
        }
    }
}
