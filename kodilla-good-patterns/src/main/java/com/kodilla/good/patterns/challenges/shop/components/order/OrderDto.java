package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.Product;
import com.kodilla.good.patterns.challenges.shop.components.model.User;

public class OrderDto {

    private final User user;
    private final Product product;
    private final OrderStatus orderStatus;

    public OrderDto(User user, Product product, OrderStatus orderStatus) {
        this.user = user;
        this.product = product;
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
