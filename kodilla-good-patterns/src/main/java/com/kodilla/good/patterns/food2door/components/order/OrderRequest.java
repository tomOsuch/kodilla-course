package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public Provider provider;
    public Product product;
    public LocalDateTime orderDate;


    public OrderRequest(User user, Provider provider, Product product, LocalDateTime orderDate) {
        this.user = user;
        this.provider = provider;
        this.product = product;
        this.orderDate = orderDate;

    }

    public User getUser() {
        return user;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
