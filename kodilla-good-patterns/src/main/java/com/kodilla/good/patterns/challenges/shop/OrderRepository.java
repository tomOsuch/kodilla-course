package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, double price, LocalDateTime orderDate);
}
