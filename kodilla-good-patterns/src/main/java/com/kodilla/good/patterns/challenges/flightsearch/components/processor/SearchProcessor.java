package com.kodilla.good.patterns.challenges.flightsearch.components.processor;

import com.kodilla.good.patterns.challenges.flightsearch.components.message.MessageService;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchRepository;
import com.kodilla.good.patterns.challenges.flightsearch.components.search.SearchService;

public class SearchProcessor {

    private final SearchService searchService;
    private final SearchRepository searchRepository;


    public SearchProcessor(SearchService searchService, SearchRepository searchRepository) {
        this.searchService = searchService;
        this.searchRepository = searchRepository;
    }
}
