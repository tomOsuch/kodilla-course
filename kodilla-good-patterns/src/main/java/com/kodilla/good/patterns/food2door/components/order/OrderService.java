package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.time.LocalDateTime;
import java.util.Map;

public interface OrderService {
    boolean order(Map<Product, Integer> products);
}
