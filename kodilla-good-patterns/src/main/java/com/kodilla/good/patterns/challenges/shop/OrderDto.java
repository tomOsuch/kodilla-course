package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDto {

    public User user;
    public BigDecimal price;
    public LocalDateTime orderDate;
    public OrderStatus orderStatus;

    public OrderDto(User user, BigDecimal price, LocalDateTime orderDate, OrderStatus orderStatus) {
        this.user = user;
        this.price = price;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
