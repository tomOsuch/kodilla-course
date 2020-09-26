package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDto {

    public User user;
    public BigDecimal price;
    public LocalDateTime dateOrder;

    public OrderDto(User user, BigDecimal price, LocalDateTime dateOrder) {
        this.user = user;
        this.price = price;
        this.dateOrder = dateOrder;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }
}
