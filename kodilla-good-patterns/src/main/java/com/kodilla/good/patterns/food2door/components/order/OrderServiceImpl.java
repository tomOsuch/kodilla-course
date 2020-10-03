package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;


import java.util.Map;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(Map<Product, Integer> products){

        if (!products.entrySet().stream()
                .collect(Collectors.toList()).stream()
                .map(a -> a.getKey().getProvider().process(products))
                .allMatch(process -> process.equals(true))) throw new OrderException();

    }
}
