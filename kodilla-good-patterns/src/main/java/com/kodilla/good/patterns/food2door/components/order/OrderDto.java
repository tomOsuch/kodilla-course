package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

public class OrderDto {

    private final User user;
    private final Provider provider;
    private final Product product;
    private final OrderStatus orderStatus;

    public OrderDto(User user, Provider provider, Product product, OrderStatus orderStatus) {
        this.user = user;
        this.provider = provider;
        this.product = product;
        this.orderStatus = orderStatus;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
