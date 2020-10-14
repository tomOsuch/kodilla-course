package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;


import java.util.*;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(Map<Product, Integer> products){

        boolean overallResult = groupByProvider(products).entrySet().stream()
                .map(providerProducts -> providerProducts.getKey().process(providerProducts.getValue()))
                //.reduce((r1, r2) -> r1 && r2)
                .allMatch(result -> result.equals(true));

        if (!overallResult) throw new OrderException();
    }

    private void addProductToProvider(Map<Provider, Map<Product, Integer>> order, Product prod, int count) {
        Provider provider = prod.getProvider();
        if (order.containsKey(provider)) {
            order.get(provider).put(prod, count);
        } else {
            order.put(provider, new HashMap<>(Map.of(prod, count)));
        }
    }

    private Map<Provider, Map<Product, Integer>> groupByProvider(Map<Product, Integer> order) {
        Map<Provider, Map<Product, Integer>> orderGroupedByProvider = new HashMap<>();
        for (Map.Entry<Product, Integer> product : order.entrySet()) {
            addProductToProvider(orderGroupedByProvider, product.getKey(), product.getValue());
        }
        return orderGroupedByProvider;
    }
}
