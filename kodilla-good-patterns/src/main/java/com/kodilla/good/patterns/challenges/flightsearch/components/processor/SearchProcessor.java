package com.kodilla.good.patterns.challenges.flightsearch.components.processor;

import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchDto;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRepository;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.FlightService;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRequest;

public class SearchProcessor {

    private final FlightService flightService;
    private final SearchRepository searchRepository;

    public SearchProcessor(FlightService flightService, SearchRepository searchRepository) {
        this.flightService = flightService;
        this.searchRepository = searchRepository;
    }

    public SearchDto process(SearchRequest searchRequest) {
        searchRepository.createSearchFlights(searchRequest.getDepartureAirport(), searchRequest.getArrivalAirport());
        flightService.searchAllFlights(searchRequest.getDepartureAirport(), searchRequest.getArrivalAirport(), searchRequest.getFlightList());
        return new SearchDto(searchRequest.getFlightList(), searchRequest.getDepartureAirport(), searchRequest.getArrivalAirport());
    }
}
