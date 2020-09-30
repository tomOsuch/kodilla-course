package com.kodilla.good.patterns.food2door.components.model.provider;

public class GlutenFreeShop implements Provider {

    private final String providerName;

    public GlutenFreeShop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public boolean process() {
        return true;
    }
}
