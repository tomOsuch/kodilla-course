package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequest {

    public User user;
    public LocalDateTime orderDate;
    public Map<Product, Integer> products;

    public OrderRequest(User user, LocalDateTime orderDate, Map<Product, Integer> products) {
        this.user = user;
        this.orderDate = orderDate;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}
