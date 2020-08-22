package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearch {

    Map<String, Boolean> flightsSearch = new HashMap<>();

    public FlightSearch() {
        flightsSearch.put("EPWA", true);
        flightsSearch.put("EDGD", true);
        flightsSearch.put("EDDF", true);
        flightsSearch.put("EPKK", false);
    }

    public String findFlight(Flight flight) throws RouteNotFoundException {
        List<String> airportTrue = flightsSearch.entrySet().stream()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .filter(f -> f.equals(flight.getArrivalAirport()))
                .collect(Collectors.toList());

        if (airportTrue.size() == 0) {
            throw new RouteNotFoundException();
        }

        return "Lot do: " + flight.getArrivalAirport() + " ok!";
    }
}
