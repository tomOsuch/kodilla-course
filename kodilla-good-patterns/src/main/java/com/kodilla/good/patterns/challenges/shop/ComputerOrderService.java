package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ComputerOrderService implements OrderService {
    @Override
    public boolean order(User user, double price, LocalDateTime orderDate) {
        return true;
    }
}
