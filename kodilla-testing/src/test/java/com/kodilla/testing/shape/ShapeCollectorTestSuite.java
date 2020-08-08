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
            Assertions.assertEquals(1, shapeCollector.getFigure(1));
        }

        @Test
        void testRemoveFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle", 3);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertNull(shapeCollector.getFigure(1));
        }

        @Test
        void testGetFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle" , 3);
            //When
            Shape retrievedCircle;
            retrievedCircle = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, retrievedCircle);
        }

        @Test
        void testShowFigure() {
            //Give
            Circle circle = new Circle("Circle", 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            String toString = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals(toString, "Circle");
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
            Assertions.assertEquals(1, shapeCollector.getFigure(1));
        }

        @Test
        void testRemoveFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertFalse(result);
            Assertions.assertNull(shapeCollector.getFigure(1));
        }

        @Test
        void testGetFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            //When
            Shape retrievedSquare;
            retrievedSquare = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, retrievedSquare);
        }

        @Test
        void testShowFigure() {
            //Give
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 2);
            //When
            String toString = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals(toString, "Square");
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
            Assertions.assertEquals(1, shapeCollector.getFigure(1));
        }

        @Test
        void testRemoveFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertFalse(result);
            Assertions.assertNull(shapeCollector.getFigure(1));
        }

        @Test
        void testGetFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            Shape retrievedTriangle;
            retrievedTriangle = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, retrievedTriangle);
        }

        @Test
        void testShowFigure() {
            //Give
            Triangle triangle = new Triangle("Triangle", 2, 3);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            String toString = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals(toString, "Triangle");
        }
    }
}
