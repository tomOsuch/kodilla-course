package com.kodilla.good.patterns.food2door.components.service;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

public class MessageService implements InformationService {

    @Override
    public void sendMessageUser(User user) {
        System.out.println("Zamówiłeś zostało przyjęte");
    }
}
