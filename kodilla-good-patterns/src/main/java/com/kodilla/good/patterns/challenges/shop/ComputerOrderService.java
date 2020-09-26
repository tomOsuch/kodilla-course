package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ComputerOrderService implements OrderService {
    @Override
    public boolean order(User user, BigDecimal price, LocalDateTime orderDate) {
        return true;
    }
}
