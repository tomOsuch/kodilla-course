package com.kodilla.exception.test;

public class ExceptionHandling {

    public String probablyIWillThrowExceptionHandling(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            return result;
        } catch (Exception e) {
            return "Warunek w metodzie nie jest spełniony";
        } finally {
            System.out.println("Działa try-catch-finally");
        }

    }
}
