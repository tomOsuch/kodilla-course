package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.*;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    @Override
    public void findFlightsFrom(String source) {
        System.out.println("Szukam wszystkich lotów z: " + source);
        List<Flight> flightList = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(source))
                .collect(Collectors.toList());
        for (Flight currentFlight : flightList) {
            System.out.println("Pasuje lot z: " + currentFlight.getSource() + " do: " + currentFlight.getDestination());
        }
    }

    @Override
    public void findFlightsTo(String destination) {
        System.out.println("Szukam wszystkich lotów do: " + destination);
        List<Flight> flightList = FlightList.initializeFlightList().stream()
                .filter(s -> s.getDestination().equals(destination))
                .collect(Collectors.toList());
        for (Flight currentFlight : flightList) {
            System.out.println("Pasuje lot z: " + currentFlight.getSource() + " do: " + currentFlight.getDestination());
        }
    }

    @Override
    public void findFlightsWithInterstation(String source, String interstation, String destination) {
        System.out.println("Szukam wszystkich lotów z: " + source + " przez: " + interstation + " do: " + destination);
        List<Flight> flightList1 = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(source))
                .filter(s -> s.getDestination().equals(interstation))
                .collect(Collectors.toList());
        List<Flight> flightList2 = FlightList.initializeFlightList().stream()
                .filter(s -> s.getSource().equals(interstation))
                .filter(s -> s.getDestination().equals(destination))
                .collect(Collectors.toList());
        List<Flight> flightList = new ArrayList<>();
        flightList.addAll(flightList1);
        flightList.addAll(flightList2);

        System.out.println("Możesz stworzyć lot z przesiądką z następujących tras:");
        for (Flight currentFlight : flightList) {
            System.out.println("Lot z: " + currentFlight.getSource() + " do: " + currentFlight.getDestination());
        }
    }

}
