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
    public BigDecimal price;

    public OrderRequest(User user, LocalDateTime orderDate, Map<Product, Integer> products, BigDecimal price) {
        this.user = user;
        this.orderDate = orderDate;
        this.products = products;
        this.price = price;
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

    public BigDecimal getPrice() {
        return price;
    }
}
