package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {

    private final DataInformationService dataInformationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderService(DataInformationService dataInformationService, OrderService orderService, OrderRepository orderRepository) {
        this.dataInformationService = dataInformationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(),orderRequest.getPrice(), orderRequest.getOrderDate());

        if (isOrder) {
            dataInformationService.sendMailFromUser(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getPrice(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
