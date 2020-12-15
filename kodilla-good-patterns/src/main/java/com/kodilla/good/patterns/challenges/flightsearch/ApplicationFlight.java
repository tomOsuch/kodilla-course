package com.kodilla.good.patterns.challenges.flightsearch;

import com.kodilla.good.patterns.challenges.flightsearch.components.search.FlightServiceImpl;

public class ApplicationFlight {

    public static void main(String[] args) {
        FlightServiceImpl flightService = new FlightServiceImpl();
         flightService.findFlightsFrom("Gdańsk");
         flightService.findFlightsTo("Wrocław");
         flightService.findFlightsWithInterstation("Gdańsk", "Kraków", "Wrocław");
    }
}
