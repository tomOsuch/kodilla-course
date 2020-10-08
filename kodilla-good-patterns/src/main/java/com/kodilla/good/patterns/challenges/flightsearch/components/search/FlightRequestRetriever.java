package com.kodilla.good.patterns.challenges.flightsearch.components.search;

import com.kodilla.good.patterns.challenges.flightsearch.components.model.Airport;
import com.kodilla.good.patterns.challenges.flightsearch.components.model.Flight;

import java.util.List;

public class FlightRequestRetriever {

    private static final List<Flight> flights;
    private static final Airport epgd = new Airport("Gdansk", "EPGD");
    private static final Airport epwr = new Airport("Wrocław", "EPWR");
    private static final Airport epkk = new Airport("Krakow", "EPKK");

    static {
        flights = List.of(
                new Flight("LOT123", epgd, epwr),
                new Flight("LOT134", epgd, epwr),
                new Flight("LH321", epgd, epkk),
                new Flight("LH321", epkk, epwr),
                new Flight("LOT123", epwr, epgd),
                new Flight("LOT134", epwr, epgd),
                new Flight("LH321", epwr, epgd));
    }

    public SearchRequest retriever() {
        return new SearchRequest(epgd, epwr, flights);
    }
}
