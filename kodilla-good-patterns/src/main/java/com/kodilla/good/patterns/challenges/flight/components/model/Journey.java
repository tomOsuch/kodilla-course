package com.kodilla.good.patterns.challenges.flight.components.model;

public class Journey {

    private final Flight firstFlight;
    private Flight secondFlight;
    private Flight thirdFlight;

    public Journey(final Flight firstFlight) {
        this.firstFlight = firstFlight;
    }

    public Journey(final Flight firstFlight, final Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public String toString() {
        if (this.secondFlight == null && this.thirdFlight == null) {
            return "Flight from " + this.firstFlight.getDeparture() + " to "
                    + this.firstFlight.getArrival();
        } else if (this.thirdFlight == null) {
            return "Flight from " + this.firstFlight.getDeparture() + " to "
                    + this.secondFlight.getArrival() + " via " + this.secondFlight.getDeparture();
        } else {
            return "Flight from " + this.firstFlight.getDeparture() + " to "
                    + this.thirdFlight.getArrival() + " via " + this.secondFlight.getDeparture() + " and "
                    + this.thirdFlight.getDeparture();
        }
    }

}
