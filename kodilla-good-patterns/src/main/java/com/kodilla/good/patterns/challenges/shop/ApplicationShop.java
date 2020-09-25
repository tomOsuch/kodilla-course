package com.kodilla.good.patterns.challenges.shop;

public class ApplicationShop {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ComputerOrderService(), new ComputerOrderRepository());
        productOrderService.process(orderRequest);
    }
}
