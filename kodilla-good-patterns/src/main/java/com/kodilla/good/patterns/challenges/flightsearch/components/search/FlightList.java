package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public static List<Flight> initializeFlightList() {
        final List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Gdańsk", "Wrocław"));
        flightList.add(new Flight("Warszawa", "Wrocław"));
        flightList.add(new Flight("Katowice", "Kraków"));
        flightList.add(new Flight("Poznań", "Wrocław"));
        flightList.add(new Flight("Wrocław", "Katowice"));
        flightList.add(new Flight("Kraków", "Wrocław"));
        flightList.add(new Flight("Warszawa", "Gdańsk"));
        flightList.add(new Flight("Warszawa", "Poznań"));
        return new ArrayList<>(flightList);
    }

}
