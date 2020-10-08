package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.List;

public class SearchRequest {

    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final List<Flight> flightList;

    public SearchRequest(Airport departureAirport, Airport arrivalAirport, List<Flight> flightList) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightList = flightList;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
