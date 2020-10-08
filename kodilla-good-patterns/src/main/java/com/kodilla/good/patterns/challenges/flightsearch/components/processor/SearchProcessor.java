package com.kodilla.good.patterns.challenges.flightsearch.components.processor;

import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRepository;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.FlightService;

public class SearchProcessor {

    private final FlightService flightService;
    private final SearchRepository searchRepository;

    public SearchProcessor(FlightService flightService, SearchRepository searchRepository) {
        this.flightService = flightService;
        this.searchRepository = searchRepository;
    }
}
