package com.kodilla.good.patterns.food2door.components.service;

import com.kodilla.good.patterns.food2door.components.model.User;

public class MessageService implements InformationService {

    @Override
    public void sendMessageOrderSuccessToUser(User user) {
        System.out.println("Zamówiłeś zostało przyjęte");
    }

    @Override
    public void sendMessageOrderFailToUser(User user) {
        System.out.println("Zamówienie nie może zostać ztrealizowane");
    }
}
