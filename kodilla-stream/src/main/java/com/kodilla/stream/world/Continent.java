package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> countriesOfContinent;

    public Continent(String continentName, Set<Country> countriesOfContinent) {
        this.continentName = continentName;
        this.countriesOfContinent = countriesOfContinent;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountriesOfContinent() {
        return countriesOfContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
