package com.kodilla.good.patterns.food2door.components.model.provider;

import com.kodilla.good.patterns.food2door.components.model.Product;

import java.util.Map;

public class ExtraFoodShop implements Provider {

    private final String providerName;

    public ExtraFoodShop(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String getProviderName() {
        return providerName;
    }

    @Override
    public boolean process(Map<Product, Integer> products) {
        return false;
    }
}
