package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double resultTry = 0;
        try {
            if (b == 0) throw new ArithmeticException();
            resultTry = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero!");
        } finally {
            System.out.println("Działa try-catch-finally");;
        }
        return resultTry;
    }


    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
