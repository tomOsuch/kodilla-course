package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {

    private static final List<Provider> providers;
    private static final Map<Provider, Product> orders;

    static {
        providers = List.of(
                new Provider("ExtraFoodShop"),
                new Provider("HealthyShop"),
                new Provider("GlutenFreeShop")
        );

        orders = Map.of(
                providers.get(0), new Product( "Test", 13.0)
        );

    }

    public OrderRequest retriever() {
        User user = new User(1, "jkowalski", "1234", "jan.kowalski@test.pl", "Ul. Kwiatowa 12");


        return new OrderRequest(user, providers.get(0), orders.get(0));
    }
}
