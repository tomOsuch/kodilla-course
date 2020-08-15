package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleNumber;

    public Country(String countryName, BigDecimal peopleNumber) {
        this.countryName = countryName;
        this.peopleNumber = peopleNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleNumber;
    }
}
