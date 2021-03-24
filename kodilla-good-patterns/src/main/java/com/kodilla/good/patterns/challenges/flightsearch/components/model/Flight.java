package com.kodilla.good.patterns.challenges.flightsearch.components.model;

public class Flight {

    final private String source;
    final private String destination;

    public Flight(final String source, final String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public int hashCode() {
        return source.hashCode() * destination.hashCode();
    }
}
