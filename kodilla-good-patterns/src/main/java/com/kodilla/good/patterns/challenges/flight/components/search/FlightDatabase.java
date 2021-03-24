package com.kodilla.good.patterns.challenges.flight.components.search;

import com.kodilla.good.patterns.challenges.flight.components.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    private final List<Flight> flights = new ArrayList<>();

    public FlightDatabase(){
        this.flights.add(new Flight("RZESZOW", "KRAKOW"));
        this.flights.add(new Flight("KRAKOW", "RZESZOW"));
        this.flights.add(new Flight("WROCLAW", "RZESZOW"));
        this.flights.add(new Flight("RZESZOW", "WROCLAW"));
        this.flights.add(new Flight("WARSZAWA", "KRAKOW"));
        this.flights.add(new Flight("KRAKOW", "WARSZAWA"));
        this.flights.add(new Flight("POZNAN", "RZESZOW"));
        this.flights.add(new Flight("RZESZOW", "POZNAN"));
        this.flights.add(new Flight("RZESZOW", "WARSZAWA"));
        this.flights.add(new Flight("WARSZAWA", "RZESZOW"));
        this.flights.add(new Flight("KRAKOW", "POZNAN"));
        this.flights.add(new Flight("POZNAN", "KRAKOW"));
        this.flights.add(new Flight("GDANSK", "WARSZAWA"));
        this.flights.add(new Flight("WARSZAWA", "GRANSK"));
        this.flights.add(new Flight("POZNAN", "GDANSK"));
        this.flights.add(new Flight("GDANSK", "POZNAN"));
        this.flights.add(new Flight("POZNAN", "WARSZAWA"));
        this.flights.add(new Flight("WARSZAWA", "POZNAN"));
        this.flights.add(new Flight("GDANSK", "KRAKOW"));
        this.flights.add(new Flight("KRAKOW", "GDANSK"));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
