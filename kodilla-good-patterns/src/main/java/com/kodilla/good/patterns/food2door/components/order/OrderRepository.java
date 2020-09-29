package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, Provider provider, Product product, double countProduct, LocalDateTime orderDate);
}
