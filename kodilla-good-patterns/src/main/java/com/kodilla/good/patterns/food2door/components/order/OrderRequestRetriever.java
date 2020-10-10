package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.*;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequestRetriever {

    private static final Map<Product, Integer> cart;
    private static final ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
    private static final HealthyShop healthyShop = new HealthyShop("HealthyShop");
    private static final GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

    static {
        cart = Map.of(
                new Product("Chleb bez glutenowy", glutenFreeShop, new BigDecimal("5.99")), 2,
                new Product("Mleko sojowe", healthyShop, new BigDecimal("4.99")), 1,
                new Product("Krewetki", healthyShop, new BigDecimal("10.50")), 3,
                new Product("Kalmary", extraFoodShop, new BigDecimal("10.50")), 3
        );
    }

    public OrderRequest retriever() {
        User user = new User(1, "jkowalski", "1234", "jan.kowalski@test.pl", "Ul. Kwiatowa 12");
        LocalDateTime orderDate = LocalDateTime.of(2020, 9, 12, 12, 0);
        return new OrderRequest(user, orderDate, cart);
    }


}
