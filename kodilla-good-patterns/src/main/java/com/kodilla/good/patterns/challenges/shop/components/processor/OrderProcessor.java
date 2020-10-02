package com.kodilla.good.patterns.challenges.shop.components.processor;

import com.kodilla.good.patterns.challenges.shop.components.order.OrderRequest;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderDto;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderRepository;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderStatus;
import com.kodilla.good.patterns.challenges.shop.components.service.InformationService;
import com.kodilla.good.patterns.challenges.shop.components.order.OrderService;

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
        boolean isOrderSuccessful = orderService.order(orderRequest.getUser(), orderRequest.getProduct().getPrice(), orderRequest.getOrderDate());
        if (isOrderSuccessful) {
            informationService.sendNotification(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct().getPrice(), orderRequest.getOrderDate(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), OrderStatus.ORDERED);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), OrderStatus.CANCELLED);
        }
    }
}
