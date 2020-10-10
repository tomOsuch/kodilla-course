package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    @Override
    public void searchAllFlights(Airport departureAirport, Airport arrivalAirport, List<Flight> flights) {
        Map<String, List<Flight>> flightMap = groupFlightsToAirport(flights);

        flightMap.entrySet().stream()
                .filter(a -> a.getKey().equals(departureAirport.getKeyName()))
                .map(Map.Entry::getValue)
                .map(b -> b.toString())
                .forEach(System.out::println);

        flightMap.entrySet().stream()
                .filter(a -> a.getKey().equals(arrivalAirport.getKeyName()))
                .map(Map.Entry::getValue)
                .map(b -> b.toString())
                .forEach(System.out::println);


    }

    private void addFlightToKeyAirport(Map<String, List<Flight>> flightsMap, Flight flight) {
        String keyAirportName = flight.getDepartureAirport().getKeyName();
        if (flightsMap.containsKey(keyAirportName)) {
            flightsMap.get(keyAirportName).add(flight);
        } else {
            flightsMap.put(keyAirportName, new ArrayList<>(List.of(flight)));
        }
    }

    private Map<String, List<Flight>> groupFlightsToAirport(List<Flight> flights) {
        Map<String, List<Flight>> flightMap = new HashMap<>();
        for (Flight flight : flights) {
            addFlightToKeyAirport(flightMap, flight);
        }
        return flightMap;
    }

}
