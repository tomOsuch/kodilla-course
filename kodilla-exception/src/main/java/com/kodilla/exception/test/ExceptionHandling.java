package com.kodilla.exception.test;

public class ExceptionHandling {

    public String probablyIWillThrowExceptionHandling(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            return "Warunek w metodzie nie jest spełniony";
        } finally {
            System.out.println("Działa try-catch-finally");
        }

    }
}
