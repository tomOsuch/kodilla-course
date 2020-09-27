package com.kodilla.good.patterns.challenges.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public void createOrder(User user, BigDecimal price, LocalDateTime orderDate, String product) {
        System.out.println("Zamówienie produktu zostało utworzone: Cena: " + price + " rodzaj: " + product + "; data zamówienia: " + orderDate);

    }
}
