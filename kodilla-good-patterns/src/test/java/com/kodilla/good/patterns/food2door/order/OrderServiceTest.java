package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.components.model.provider.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.components.model.provider.HealthyShop;
import com.kodilla.good.patterns.food2door.components.order.OrderException;
import com.kodilla.good.patterns.food2door.components.order.OrderService;
import com.kodilla.good.patterns.food2door.components.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class OrderServiceTest {

    private Map<Product, Integer> createOrder() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        return Map.of(
                new Product("Chleb bez glutenowy", glutenFreeShop, new BigDecimal("5.99")), 2,
                new Product("Mleko sojowe", healthyShop, new BigDecimal("4.99")), 1,
                new Product("Krewetki", extraFoodShop, new BigDecimal("10.50")), 3
        );
    }

    @Mock
    OrderService orderServiceMock;

    @Test
    void testOrder() throws OrderException {
        //Give
        OrderServiceImpl orderService = new OrderServiceImpl();
        Map<Product, Integer> orders = createOrder();

        //When

        //Then

    }
}
