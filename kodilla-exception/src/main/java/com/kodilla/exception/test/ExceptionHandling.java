package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 3));
        } catch (Exception e) {
            System.out.println("Warunek w metodzie nie jest spełniony");
        } finally {
            System.out.println("Działa try-catch-finally");
        }
    }
}
