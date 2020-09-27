package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, BigDecimal price, LocalDateTime orderDate);
}
