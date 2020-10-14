package com.kodilla.good.patterns.food2door.components.order;


import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderDto {

    private final User user;
    private final Map<Product, Integer> products;
    private final LocalDateTime orderDate;
    private final OrderStatus orderStatus;

    public OrderDto(User user, Map<Product, Integer> products, LocalDateTime orderDate, OrderStatus orderStatus) {
        this.user = user;
        this.products = products;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
