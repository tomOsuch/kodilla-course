package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 3));
        } catch (Exception e) {
            System.out.println("Warunek w metodzie nie jest spełniony");
        } finally {
            System.out.println("Działa try-catch-finally");
        }
    }

    public void probablyIWillThrowExceptionHandling(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Warunek w metodzie nie jest spełniony");
        } finally {
            System.out.println("Działa try-catch-finally");
        }
    }
}
