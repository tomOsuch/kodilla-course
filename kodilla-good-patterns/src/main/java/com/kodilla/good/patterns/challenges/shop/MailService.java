package com.kodilla.good.patterns.challenges.shop;

public class MailService implements InformationService {

    public void sendmailToUser(User user) {
        System.out.println("Mail z zamówieniem został wysłany do użytkownika: " + user.getFirstname() + " " + user.getLastname() + ", na adres mailowy: " + user.getEmail());
    }
}
