package com.kodilla.good.patterns.food2door.components.service;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;
import com.kodilla.good.patterns.food2door.components.order.OrderStatus;

public class MessageService implements InformationService {

    @Override
    public void sendMessageAcceptOrder(User user, Provider provider, Product product) {
        System.out.println("Na podany adres mailowy: " + user.getEmail() + " został wysłany link do akceptacji zamówienia");
    }

    @Override
    public void sendMessageUser(User user, Product product) {
        System.out.println("Zamówiłeś produkt: " + product.getName() + " czekaj na kolejny mail z linkiem do płatności");
    }
}
