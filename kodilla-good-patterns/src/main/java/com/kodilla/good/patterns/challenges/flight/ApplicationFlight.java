package com.kodilla.good.patterns.challenges.flight;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;
import com.kodilla.good.patterns.challenges.flight.components.search.FlightServiceImpl;

import java.util.Set;

public class ApplicationFlight {

    public static void main(String[] args) {
        FlightServiceImpl flightFinder = new FlightServiceImpl();

        Set<Flight> flightsFromGdansk = flightFinder.findFlightFromAirport("Gdańsk");
        Set<Flight> flightsToWroclaw = flightFinder.findFlightToAirport("Wrocław");

        Set<Flight> flightsFromGdanskToWroclaw = flightFinder.findStopoverAirport("Gdańsk", "Wrocław");
        System.out.println("Loty z Gdańska: ");
        System.out.println(flightsFromGdansk);
        System.out.println("Loty do Wrocławia: ");
        System.out.println(flightsToWroclaw);
        System.out.println("Loty z Gdańska do Wrocławia z przesiadką");
        System.out.println(flightsFromGdanskToWroclaw);
        Set<Flight> forEachFindStopoverAirport = flightFinder.forEachFindStopoverAirport("Gdańsk", "Wrocław");
        System.out.println("Loty z Gdańska do Wrocławia z przesiadką z użyciem pętli");
        System.out.println(forEachFindStopoverAirport);
    }
}
