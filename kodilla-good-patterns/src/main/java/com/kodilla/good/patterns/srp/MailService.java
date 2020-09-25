package com.kodilla.good.patterns.srp;

public class MailService implements InformationService {

    @Override
    public void inFrom(User user) {
        System.out.println("Send mail from user name: " + user.getFirstname() + " " + user.getLastname());
    }
}
