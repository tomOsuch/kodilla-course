package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    Map<String, Boolean> flightsSearch = new HashMap<>();

    public FlightSearch() {
        flightsSearch.put("EPWA", true);
        flightsSearch.put("EDGD", true);
        flightsSearch.put("EDDF", true);
        flightsSearch.put("EPKK", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

    }
}
