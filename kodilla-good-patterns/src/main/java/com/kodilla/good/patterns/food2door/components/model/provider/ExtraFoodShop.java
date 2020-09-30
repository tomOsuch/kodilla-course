package com.kodilla.good.patterns.food2door.components.model.provider;

public class ExtraFoodShop implements Provider {

    private final String providerName;

    public ExtraFoodShop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public boolean process() {
        return false;
    }
}
