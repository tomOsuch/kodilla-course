package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.Provider;
import com.kodilla.good.patterns.food2door.components.model.User;

import java.time.LocalDateTime;

public class ProviderOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Provider provider, Product product, double countProduct, LocalDateTime orderDate) {

        if (product.getName() == "ExtraFoodShop") {
            System.out.println("Zamówienie zostało utworzone:");
            System.out.println("Sklep: " + provider.getName() + "; Produkt: " + product.getName() + "; liczba: " + countProduct + "; data zamówienia: " + orderDate);
        } else if (product.getName() == "HealthyShop") {
            System.out.println("HealthyShop - Dziękujemy za utworzenie zamówienia");
        } else {
            System.out.println("Super że złożyłeś zamówienie");
        }
    }
}
