package com.kodilla.good.patterns.food2door.components.model.provider;

public class HealthyShop implements Provider {

    private final ProviderName providerName;

    public HealthyShop(ProviderName providerName) {
        this.providerName = providerName;
    }

    public ProviderName getProviderName() {
        return providerName;
    }

    @Override
    public boolean process() {
        return true;
    }
}
