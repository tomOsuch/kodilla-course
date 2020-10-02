package com.kodilla.good.patterns.challenges.shop.components.service;

import com.kodilla.good.patterns.challenges.shop.components.model.User;

public class MailService implements InformationService {

    public void sendNotification(User user) {
        System.out.println("Mail z zamówieniem został wysłany do użytkownika: " + user.getFirstname() + " " + user.getLastname() + ", na adres mailowy: " + user.getEmail());
    }
}
