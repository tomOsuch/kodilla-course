package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(2,1);
        int resultSubtract = calculator.subtract(2,1);

        if (resultAdd == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        if (resultSubtract == 1) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
