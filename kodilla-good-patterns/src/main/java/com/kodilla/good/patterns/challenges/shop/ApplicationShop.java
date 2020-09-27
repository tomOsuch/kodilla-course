package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.components.order.OrderRequest;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.shop.components.order.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.shop.components.processor.OrderProcessor;
import com.kodilla.good.patterns.challenges.shop.components.service.MailService;
import com.kodilla.good.patterns.challenges.shop.components.order.ProductOrderService;

public class ApplicationShop {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
