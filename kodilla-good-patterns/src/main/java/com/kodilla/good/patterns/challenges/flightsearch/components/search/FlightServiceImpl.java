package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Journey;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    private final FlightList database = new FlightList();

    @Override
    public List<Flight> getFlightsFromCity(final String city) {

        return FlightList.initializeFlightList()
                .stream()
                .filter(flight -> flight.getDeparture().equals(city.toUpperCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> getFlightsToCity(final String city) {

        return FlightList.initializeFlightList()
                .stream()
                .filter(flight -> flight.getArrival().equals(city.toUpperCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Journey> getFlightsFromTo(final String departure, final String arrival) {

        List<Journey> results = FlightList.initializeFlightList()
                .stream()
                .filter(isFlightInDatabase(departure, arrival))
                .map(Journey::new)
                .collect(Collectors.toList());

        addPossibleIndirectFlights(departure, arrival, results);
        return results;
    }

    private void addPossibleIndirectFlights(String departure, String arrival, List<Journey> results) {
        for (Flight flightFrom : getFlightsFromCity(departure)) {
            for (Flight flightTo : getFlightsToCity(arrival)) {
                if (flightFrom.getArrival().equals(flightTo.getDeparture())) {
                    Journey journey = new Journey(flightFrom, flightTo);
                    results.add(journey);
                }
            }
        }
    }

    private Predicate<Flight> isFlightInDatabase(String departure, String arrival) {
        return flight -> flight.getDeparture().equals(departure.toUpperCase())
                && flight.getArrival().equals(arrival.toUpperCase());
    }

    @Override
    public void displayFlightsTo(final String city) {
        List<Flight> flights = getFlightsToCity(city);
        displaySelectedFlights(flights);
    }

    @Override
    public void displayFlightsFrom(final String city) {
        List<Flight> flights = getFlightsFromCity(city);
        displaySelectedFlights(flights);
    }

    @Override
    public void displayFlightsFromTo(final String derparture, final String arrival) {
        List<Journey> flights = getFlightsFromTo(derparture, arrival);
        displaySelectedFlights(flights);
    }

    private void displaySelectedFlights(List flights) {
        if (flights.isEmpty()) {
            System.out.println("Such flights don't exist.");
        } else {
            flights.forEach(System.out::println);
            System.out.println();
        }
    }

}
