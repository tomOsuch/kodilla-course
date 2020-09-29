package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Provider;
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

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrderSuccessful = orderService.order(orderRequest.getUser(), orderRequest.getProvider(), orderRequest.getProduct(), orderRequest.getOrderDate());

        if (isOrderSuccessful) {
            if (orderRequest.getProvider().getName() == "ExtraFoodShop") {
                informationService.sendMessageUser(orderRequest.getUser(), orderRequest.getProduct());
                orderRepository.createOrder(orderRequest.getUser(),orderRequest.getProvider(), orderRequest.getProduct(), orderRequest.product.getCount(), orderRequest.getOrderDate());
            } else if (orderRequest.getProvider().getName() == "HealthyShop") {
                orderRepository.createOrder(orderRequest.getUser(),orderRequest.getProvider(), orderRequest.getProduct(), orderRequest.product.getCount(), orderRequest.getOrderDate());
                informationService.sendMessageAcceptOrder(orderRequest.getUser(), orderRequest.getProvider(), orderRequest.getProduct());
            } else {
                informationService.sendMessageUser(orderRequest.getUser(), orderRequest.getProduct());
                informationService.sendMessageAcceptOrder(orderRequest.getUser(), orderRequest.getProvider(), orderRequest.getProduct());
                orderRepository.createOrder(orderRequest.getUser(),orderRequest.getProvider(), orderRequest.getProduct(), orderRequest.product.getCount(), orderRequest.getOrderDate());
            }

            return new OrderDto(orderRequest.getUser(), orderRequest.getProvider(), orderRequest.getProduct(), OrderStatus.ORDERED);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProvider(), orderRequest.getProduct(), OrderStatus.CANCELLED);
        }
    }

}
