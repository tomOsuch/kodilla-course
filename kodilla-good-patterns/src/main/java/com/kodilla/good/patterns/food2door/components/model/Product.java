package com.kodilla.good.patterns.food2door.components.model;

import com.kodilla.good.patterns.food2door.components.model.provider.Provider;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final Provider provider;

    public Product(String name, Provider provider) {
        this.name = name;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public Provider getProvider() {
        return provider;
    }
}
