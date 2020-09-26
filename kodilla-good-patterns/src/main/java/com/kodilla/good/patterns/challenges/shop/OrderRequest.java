package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final BigDecimal price;
    private final LocalDateTime orderDate;

    public OrderRequest(User user, BigDecimal price, LocalDateTime orderDate) {
        this.user = user;
        this.price = price;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
