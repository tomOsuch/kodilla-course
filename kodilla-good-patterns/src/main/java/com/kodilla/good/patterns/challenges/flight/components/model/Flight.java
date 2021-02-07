package com.kodilla.good.patterns.challenges.flight.components.model;

public class Flight {

    private final String departureAirport;
    private final String arrivalAirport;
    private final String flightNo;

    public Flight(String departureAirport, String arrivalAirport, String flightNo) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNo = flightNo;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getFlightNo() {
        return flightNo;
    }

    @Override
    public String toString() {
        return "Flight number: " + flightNo +
                " from: " + departureAirport +
                " to: " + arrivalAirport;
    }
}
