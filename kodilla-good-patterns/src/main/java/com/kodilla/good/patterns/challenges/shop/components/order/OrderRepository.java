package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.Product;
import com.kodilla.good.patterns.challenges.shop.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, BigDecimal price, LocalDateTime orderDate, Product product);
}
