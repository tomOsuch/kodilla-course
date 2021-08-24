package com.kodilla.good.patterns.challenges.flight.components.model;

public class Flight {
    private final String departure;
    private final String arrival;


    public Flight(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String toString() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

}
