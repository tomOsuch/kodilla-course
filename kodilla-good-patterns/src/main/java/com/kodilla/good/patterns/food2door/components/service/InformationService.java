package com.kodilla.good.patterns.food2door.components.service;

import com.kodilla.good.patterns.food2door.components.model.User;

public interface InformationService {

    void sendMessageOrderSuccessToUser(User user);

    void sendMessageOrderFailToUser(User user);
}
