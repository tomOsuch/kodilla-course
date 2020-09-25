package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final double price;
    private final LocalDateTime orderDate;

    public OrderRequest(User user, double price, LocalDateTime orderDate) {
        this.user = user;
        this.price = price;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
