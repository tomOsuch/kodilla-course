package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.User;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderRequest;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Ul. Kwiatowa 13", "jan.kowalski@test.pl");

        LocalDateTime orderDate = LocalDateTime.of(2020, 9, 12, 12, 0);

        return new OrderRequest(user, orderDate, 0);
    }
}
