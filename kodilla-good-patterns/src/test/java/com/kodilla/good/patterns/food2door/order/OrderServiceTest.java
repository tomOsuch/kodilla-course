package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.components.model.provider.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.components.model.provider.HealthyShop;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.order.OrderException;
import com.kodilla.good.patterns.food2door.components.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class OrderServiceTest {

    private Map<Product, Integer> createOrderTrue() {
        Provider healthyShopMock = new HealthyShop("HealthyShop");
        Provider glutenFreeShopMock = new GlutenFreeShop("GlutenFreeShop");

        return Map.of(
                new Product("Chleb bez glutenowy", glutenFreeShopMock), 2,
                new Product("Mleko sojowe", healthyShopMock), 1,
                new Product("Krewetki", healthyShopMock), 3
        );
    }

    private Map<Product, Integer> createOrderFalse() {
        Provider extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        Provider healthyShop = new HealthyShop("HealthyShop");
        Provider glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        return Map.of(
                new Product("Chleb bez glutenowy", glutenFreeShop), 2,
                new Product("Mleko sojowe", healthyShop), 1,
                new Product("Krewetki", extraFoodShop), 3
        );
    }

    @Test
    void testOrderTrue() {
        //Give
        OrderServiceImpl orderService = new OrderServiceImpl();
        Map<Product, Integer> orders = createOrderTrue();
        //When

        //Then
        Assertions.assertDoesNotThrow(() -> orderService.order(createOrderTrue()));

    }

    @Test
    void testOrderFalse() throws OrderException {
        OrderServiceImpl orderService = new OrderServiceImpl();
        Map<Product, Integer> orders = createOrderFalse();
        //When

        //Then
        Assertions.assertThrows(OrderException.class, () -> orderService.order(createOrderFalse()));
    }
}
