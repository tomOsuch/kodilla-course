package com.kodilla.good.patterns.challenges.shop;

import java.util.List;

public class ProductType {

    List<String> products = null;

    public ProductType() {
        products = List.of("Komputer", "Ładowarka", "Samochód");
    }

    public String getProduct(int index) {
        return products.get(index);
    }
}
