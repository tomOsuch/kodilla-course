package com.kodilla.good.patterns.challenges.flight.components.search;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;

import java.util.Set;

public interface FlightService {

    Set<Flight> findFlightFromAirport(String searchedDepartureAirport);

    Set<Flight> findFlightToAirport(String searchedArrivalAirport);

    Set<Flight> findStopoverAirport(String searchedDepartureAirport, String searchedArrivalAirport);

    Set<Flight> forEachFindStopoverAirport(String searchedDepartureAirport, String searchedArrivalAirport);
}
