package com.kodilla.exception.test;

import java.util.Map;

public class FlightProgram {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("EPWA", "EDDF");

        for (Map.Entry<String, Boolean> flights : flightSearch.flightsSearch.entrySet()) {
            System.out.println(flights.getKey() + "; " + flights.getValue());
        }

        try {
            System.out.println(flightSearch.findFlight(flight));
        } catch (RouteNotFoundException e) {
            System.out.println("Nie ma takiego lotu na lotnisko: " + flight.getArrivalAirport());
        }
    }
}
