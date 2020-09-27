package com.kodilla.good.patterns.challenges.shop;

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
        boolean isOrder = orderService.order(orderRequest.getUser(), orderRequest.getPrice(), orderRequest.getOrderDate());
        OrderDto orderDto = null;
        if (isOrder) {
            informationService.sendNotification(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getPrice(), orderRequest.getOrderDate(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), orderRequest.getPrice(), orderRequest.getOrderDate(), OrderStatus.ORDERED);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getPrice(), orderRequest.getOrderDate(), OrderStatus.CANCELLED);
        }
    }
}
