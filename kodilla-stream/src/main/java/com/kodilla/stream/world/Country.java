package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final String peopleNumber;

    public Country(String countryName, String peopleNumber) {
        this.countryName = countryName;
        this.peopleNumber = peopleNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return new BigDecimal(peopleNumber);
    }
}
