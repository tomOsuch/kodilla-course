package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public interface OrderRepository {
    void createOrder(User user, Map<Product, Integer> products, LocalDateTime orderDate, BigDecimal price);
}
