package com.kodilla.good.patterns.food2door.components.model.provider;

import com.kodilla.good.patterns.food2door.components.model.Product;

import java.util.Map;

public interface Provider {

    boolean process(Map<Product, Integer> products);
    String getProviderName();
}
