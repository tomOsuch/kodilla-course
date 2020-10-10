package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.List;

public class SearchDto {

    private final List<Flight> flights;
    private final Airport departureAirport;
    private final Airport arrivalAirport;

    public SearchDto(List<Flight> flights, Airport departureAirport, Airport arrivalAirport) {
        this.flights = flights;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }
}
