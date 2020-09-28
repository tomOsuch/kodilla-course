package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

public class OrderRequest {

    public User user;
    public Provider provider;
    public Product order;

    public OrderRequest(User user, Provider provider, Product order) {
        this.user = user;
        this.provider = provider;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getOrder() {
        return order;
    }
}
