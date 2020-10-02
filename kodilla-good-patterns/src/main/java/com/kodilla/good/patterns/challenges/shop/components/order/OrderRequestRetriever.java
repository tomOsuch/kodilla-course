package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.Product;
import com.kodilla.good.patterns.challenges.shop.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Ul. Kwiatowa 13", "jan.kowalski@test.pl");
        Product product = new Product("Komputer", new BigDecimal("2590.99"));
        LocalDateTime orderDate = LocalDateTime.of(2020, 9, 12, 12, 0);

        return new OrderRequest(user, orderDate, product);
    }
}
