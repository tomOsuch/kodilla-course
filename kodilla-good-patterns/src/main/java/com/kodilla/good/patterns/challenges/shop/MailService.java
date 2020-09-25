package com.kodilla.good.patterns.challenges.shop;

public class MailService implements  DataInformationService {

    @Override
    public void sendMailFromUser(User user) {
        System.out.println("Mail z zamówieniem został wysłany do użytkownika: " + user.getFirstname() + " " + user.getLastname() + ", na adres mailowy: " + user.getEmail());
    }
}
