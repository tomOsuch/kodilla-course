package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.*;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequestRetriever {

    private static final Map<Product, Integer> cardProducts;
    private static final ExtraFoodShop extraFoodShop = new ExtraFoodShop(ProviderName.ExtraFoodShop);
    private static final HealthyShop healthyShop = new HealthyShop(ProviderName.HealthyShop);
    private static final GlutenFreeShop glutenFreeShop = new GlutenFreeShop(ProviderName.GlutenFreeShop);

    static {
        cardProducts = Map.of(
                new Product("Chleb bez glutenowy", glutenFreeShop), 2,
                new Product("Mleko sojowe", healthyShop), 1,
                new Product("Krewetki", extraFoodShop), 3
        );
    }

    public OrderRequest retriever() {
        User user = new User(1, "jkowalski", "1234", "jan.kowalski@test.pl", "Ul. Kwiatowa 12");
        LocalDateTime orderDate = LocalDateTime.of(2020, 9, 12, 12, 0);
        return new OrderRequest(user, orderDate, cardProducts, new BigDecimal("150"));
    }

}
