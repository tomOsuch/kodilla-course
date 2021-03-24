package com.kodilla.good.patterns.challenges.flight;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;
import com.kodilla.good.patterns.challenges.flight.components.search.FlightServiceImpl;

import java.util.Set;

public class ApplicationFlight {

    public static void main(String[] args) {
        FlightServiceImpl flightFinder = new FlightServiceImpl();

        flightFinder.displayFlightsFrom("gdansk");
        flightFinder.displayFlightsTo("Rzeszow");
        flightFinder.displayFlightsFromTo("WARSZAWA", "poznan");
    }
}
