package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    ProductType productType = new ProductType();

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Ul. Kwiatowa 13", "jan.kowalski@test.pl");
        BigDecimal price = new BigDecimal("198.5");
        LocalDateTime orderDate = LocalDateTime.of(2020, 9, 12, 12, 0);

        return new OrderRequest(user, price, orderDate, productType.getProduct(1));
    }
}
