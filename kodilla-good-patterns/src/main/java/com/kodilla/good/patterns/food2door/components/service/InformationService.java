package com.kodilla.good.patterns.food2door.components.service;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;
import com.kodilla.good.patterns.food2door.components.order.OrderStatus;

public interface InformationService {

    void sendMessageAcceptOrder(User user, Provider provider, Product product);
    void sendMessageUser(User user, Product product);
}
