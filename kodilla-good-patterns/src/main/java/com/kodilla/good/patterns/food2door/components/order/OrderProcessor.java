package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.service.InformationService;

public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) throws ExceptionOrder {
        try {
            orderService.order(orderRequest.getProducts());
            informationService.sendMessageOrderSuccessToUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice(), OrderStatus.ORDERED);
        } catch (ExceptionOrder e) {
            informationService.sendMessageOrderFailToUser(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getOrderDate(), orderRequest.getPrice(), OrderStatus.CANCELLED);
        }
    }
}
