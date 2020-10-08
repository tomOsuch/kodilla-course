package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.List;

public interface FlightService {
    void searchAllFlights(Airport departureAirport, Airport arrivalAirport , List<Flight> flights);

}
