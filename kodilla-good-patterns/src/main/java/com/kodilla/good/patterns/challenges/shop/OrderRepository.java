package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, BigDecimal price, LocalDateTime orderDate);
}
