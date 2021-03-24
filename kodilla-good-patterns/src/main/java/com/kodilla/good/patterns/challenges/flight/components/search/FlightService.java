package com.kodilla.good.patterns.challenges.flight.components.search;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;
import com.kodilla.good.patterns.challenges.flight.components.model.Journey;

import java.util.List;

public interface FlightService {


    List<Flight> getFlightsFromCity(String city);

    List<Flight> getFlightsToCity(String city);

    List<Journey> getFlightsFromTo(String departure, String arrival);

    void displayFlightsTo(String city);

    void displayFlightsFrom(String city);

    void displayFlightsFromTo(String derparture, String arrival);
}
