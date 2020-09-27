package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final BigDecimal price;
    private final LocalDateTime orderDate;
    private final String product;

    public OrderRequest(User user, BigDecimal price, LocalDateTime orderDate, String product) {
        this.user = user;
        this.price = price;
        this.orderDate = orderDate;
        this.product = product;
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

    public String getProduct() {
        return product;
    }
}
