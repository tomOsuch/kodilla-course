package com.kodilla.good.patterns.challenges.flightsearch;

import com.kodilla.good.patterns.challenges.flightsearch.components.processor.SearchProcessor;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.FlightRequestRetriever;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.FlightServiceImpl;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRepositoryImpl;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRequest;

public class ApplicationFlight {

    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        SearchRequest searchRequest = flightRequestRetriever.retriever();

        SearchProcessor searchProcessor = new SearchProcessor(
                new FlightServiceImpl(), new SearchRepositoryImpl()
        );
        searchProcessor.process(searchRequest);
    }
}
