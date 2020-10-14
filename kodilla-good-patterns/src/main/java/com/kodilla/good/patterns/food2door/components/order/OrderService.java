package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;

import java.util.Map;

public interface OrderService {
    void order(Map<Product, Integer> products);

}
