package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;

public interface SearchRepository {
    void createSearchFlights(Airport departureAirport, Airport arrivalAirport);
}
