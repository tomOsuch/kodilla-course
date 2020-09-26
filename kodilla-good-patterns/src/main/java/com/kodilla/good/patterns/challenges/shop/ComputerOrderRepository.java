package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ComputerOrderRepository implements OrderRepository{
    @Override
    public void createOrder(User user, BigDecimal price, LocalDateTime orderDate) {
        System.out.println("Zamówienie komputera zostało utworzone: Cena: " + price + "; data zamówienia: " + orderDate);

    }
}
