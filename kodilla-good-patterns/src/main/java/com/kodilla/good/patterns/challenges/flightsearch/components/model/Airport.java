package com.kodilla.good.patterns.challenges.flightsearch.components.model;

public class Airport {

    private final String name;
    private final String keyName;

    public Airport(String name, String keyName) {
        this.name = name;
        this.keyName = keyName;
    }

    public String getName() {
        return name;
    }

    public String getKeyName() {
        return keyName;
    }
}
