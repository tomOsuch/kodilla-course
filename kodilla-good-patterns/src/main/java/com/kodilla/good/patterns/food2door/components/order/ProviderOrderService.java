package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public class ProviderOrderService implements OrderService {

    @Override
    public boolean order(User user, Map<Product, Integer> products, LocalDateTime orderDate) {
        return true;
    }
}
