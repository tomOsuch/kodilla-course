package com.kodilla.good.patterns.food2door.components.model;

import java.util.List;

public class Product {

    private final String name;
    private final double count;

    public Product(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }
}
