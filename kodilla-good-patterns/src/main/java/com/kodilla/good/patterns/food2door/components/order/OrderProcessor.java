package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.service.InformationService;

import java.util.stream.Collectors;

public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrderSuccessfulProvider = orderRequest.getProducts().keySet().stream()
                .map(Product::getProvider)
                .map(Provider::process)
                .collect(Collectors.toList())
                .iterator().next();
        boolean isOrderSuccessful = orderService.order(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate());

        if (isOrderSuccessfulProvider == isOrderSuccessful) {
            informationService.sendMessageUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice(), OrderStatus.ORDERED);
        } else {
            System.out.println("Wyjątek");
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice(), OrderStatus.CANCELLED);
        }



    }

}
