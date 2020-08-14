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
        Set<Country> countries = new HashSet<>();
        countries.add(new Country("Polska", "37970000"));
        countries.add(new Country("Niemcy", "83020000"));
        countries.add(new Country("Anglia", "55980000"));
        Set<Continent> continents = new HashSet<>();
        continents.add(new Continent("Europa", countries));
        //When
        BigDecimal totalPeople = world.getPeopleQuantity(continents);
        //Then
        BigDecimal expectedPeopleCount = new BigDecimal("176970000");
        assertEquals(expectedPeopleCount, totalPeople);
    }
}
