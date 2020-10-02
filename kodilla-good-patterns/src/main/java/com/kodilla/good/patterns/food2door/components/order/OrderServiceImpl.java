package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(Map<Product, Integer> products){
        if (!products.keySet().stream()
                .map(Product::getProvider)
                .map(b -> b.process(products))
                .allMatch(a -> a.equals(true))) throw new ExceptionOrder();
    }
}
