package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Set<Country> countriesEurope = new HashSet<>();
        countriesEurope.add(new Country("Polska", new BigDecimal("37970000")));
        countriesEurope.add(new Country("Niemcy", new BigDecimal("83020000")));
        countriesEurope.add(new Country("Anglia", new BigDecimal("55980000")));
        Set<Country> countriesAfrica = new HashSet<>();
        countriesAfrica.add(new Country("kenia", new BigDecimal("51390000")));

        Set<Continent> continents = new HashSet<>();
        continents.add(new Continent("Europa", countriesEurope));
        continents.add(new Continent("Africa",countriesAfrica));
        //When
        BigDecimal totalPeople = world.getPeopleQuantity(continents);
        //Then
        BigDecimal expectedPeopleCount = new BigDecimal("228360000");
        assertEquals(expectedPeopleCount, totalPeople);
    }
}
