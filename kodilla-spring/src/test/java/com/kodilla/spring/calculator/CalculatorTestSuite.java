package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2, 3);
        double resultSub = calculator.sub(2, 3);
        double resultMul = calculator.mul(2, 3);
        double resultDiv = calculator.div(10, 2);
        double resultDiv0 = calculator.div(10, 0);
        //Then
        assertEquals(5, resultAdd);
        assertEquals(-1, resultSub);
        assertEquals(6, resultMul);
        assertEquals(5, resultDiv);
        assertEquals(0, resultDiv0);
    }

}
