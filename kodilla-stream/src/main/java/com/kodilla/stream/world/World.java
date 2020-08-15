package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class World {

    public BigDecimal getPeopleQuantity(Set<Continent> continents) {
        return continents.stream()
                .map(Continent::getCountriesOfContinent)
                .flatMap(Collection::stream)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
