package com.kodilla.good.patterns.food2door.components.model;

import com.kodilla.good.patterns.food2door.components.model.provider.Provider;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final Provider provider;
    private final BigDecimal price;

    public Product(String name, Provider provider, BigDecimal price) {
        this.name = name;
        this.provider = provider;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Provider getProvider() {
        return provider;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
