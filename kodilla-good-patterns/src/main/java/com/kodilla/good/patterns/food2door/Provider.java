package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class Provider {

    private final static Map<Integer, java.lang.String> providers = new HashMap<>();

    public Provider() {


        providers.put(1, "ExtraFoodShop");
        providers.put(2, "HealthyShop");
        providers.put(3, "GlutenFreeShop");
    }

    public String getProvider(int id) {
        return providers.get(id);
    }
}
