package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;

public class SearchRepositoryImpl implements SearchRepository {
    @Override
    public void createSearchFlights(Airport departureAirport, Airport arrivalAirport) {
        System.out.println("Zostały wyszukane wszystkie loty z lotniska: " + departureAirport + " do lotniska: " + arrivalAirport);
    }
}
