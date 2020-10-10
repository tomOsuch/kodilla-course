package com.kodilla.good.patterns.challenges.flightsearch.components.model;

public class Flight {

    private final String numberFlight;
    private final Airport departureAirport;
    private final Airport arrivalAirport;

    public Flight(String numberFlight, Airport departureAirport, Airport arrivalAirport) {
        this.numberFlight = numberFlight;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "FlightNumber: " + getNumberFlight() + "; " +
                "arrivalAirport=" + arrivalAirport.getName() +
                '}';
    }

    public String printArrivalAirport() {
        return arrivalAirport.getName();
    }
}
