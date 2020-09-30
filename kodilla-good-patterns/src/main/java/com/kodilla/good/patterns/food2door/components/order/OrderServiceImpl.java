package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;


import java.util.Map;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean order(Map<Product, Integer> products) {
        return products.keySet().stream()
                .map(Product::getProvider)
                .map(Provider::process)
                .collect(Collectors.toList())
                .stream()
                .allMatch(a -> a.equals(true));
    }
}
