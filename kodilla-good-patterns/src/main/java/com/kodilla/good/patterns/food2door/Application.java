package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.order.*;
import com.kodilla.good.patterns.food2door.components.service.MessageService;

import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MessageService(), new OrderServiceImpl(), new OrderRepositoryImpl()
        );
        orderProcessor.process(orderRequest);
    }
}
