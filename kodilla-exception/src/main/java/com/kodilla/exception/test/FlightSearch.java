package com.kodilla.exception.test;

import java.util.*;


public class FlightSearch {

    private Map<String, Boolean> availableFlightsMap = new HashMap<>();

    public FlightSearch() {
        availableFlightsMap.put("EPWA", true);
        availableFlightsMap.put("EDGD", true);
        availableFlightsMap.put("EDDF", true);
        availableFlightsMap.put("EPKK", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (!availableFlightsMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return availableFlightsMap.get(flight.getArrivalAirport());
    }
}
