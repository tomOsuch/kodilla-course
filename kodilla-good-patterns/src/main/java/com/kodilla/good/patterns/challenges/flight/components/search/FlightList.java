package com.kodilla.good.patterns.challenges.flight.components.search;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;

import java.util.HashSet;
import java.util.Set;

public class FlightList {

    public Set<Flight> initFlightList() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Gdańsk", "Kraków", "LOT564"));
        flights.add(new Flight("Londyn", "Kraków", "WIZ765"));
        flights.add(new Flight("Kraków", "Wrocław", "LOT679"));
        flights.add(new Flight("Wrocław", "Londyn", "WIZ873"));
        flights.add(new Flight("Gdańsk", "Wrocław", "WIZ345"));
        flights.add(new Flight("Wrocław", "Kraków", "WIZ123"));

        return new HashSet<>(flights);
    }
}
