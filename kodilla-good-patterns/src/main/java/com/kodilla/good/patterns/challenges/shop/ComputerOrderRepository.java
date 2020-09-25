package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ComputerOrderRepository  implements OrderRepository{
    @Override
    public void createOrder(User user, double price, LocalDateTime orderDate) {
        System.out.println("Zamówienie komputera zostało utworzone: Cena: " + price + "; data zamówienia: " + orderDate);

    }
}
