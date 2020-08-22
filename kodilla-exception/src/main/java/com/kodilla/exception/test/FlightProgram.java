package com.kodilla.exception.test;


public class FlightProgram {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("EPWA", "EDDF");

        try {
            System.out.println(flightSearch.findFlight(flight));
        } catch (RouteNotFoundException e) {
            System.out.println("Nie istnieje lot na lotnisko: " + flight.getArrivalAirport());
        }
    }
}
