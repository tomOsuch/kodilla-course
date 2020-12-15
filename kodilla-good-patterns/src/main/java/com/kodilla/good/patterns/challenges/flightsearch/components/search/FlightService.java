package com.kodilla.good.patterns.challenges.flightsearch.components.search;

public interface FlightService {
    void findFlightsFrom(String source);

    void findFlightsTo(String destination);

    void findFlightsWithInterstation(String source, String interstation, String destination);
}
