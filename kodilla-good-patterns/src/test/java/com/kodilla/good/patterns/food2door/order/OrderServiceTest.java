package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.order.OrderException;
import com.kodilla.good.patterns.food2door.components.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OrderServiceTest {

    private Map<Product, Integer> createOrder() {
        Provider firstProviderMock = mock(Provider.class);
        Provider secondProviderMock = mock(Provider.class);
        Provider thirdProviderMock = mock(Provider.class);

        return Map.of(
                new Product("Chleb bez glutenowy", firstProviderMock, new BigDecimal("5.99")), 2,
                new Product("Mleko sojowe", firstProviderMock, new BigDecimal("4.99")), 1,
                new Product("Krewetki", secondProviderMock, new BigDecimal("10.50")), 3,
                new Product("Kalmary", thirdProviderMock, new BigDecimal("10.50")), 3
        );
    }

    @Test
    void testOrderTrue() throws OrderException {
        //Give
        Provider firstProviderMock = mock(Provider.class);
        Provider secondProviderMock = mock(Provider.class);
        Provider thirdProviderMock = mock(Provider.class);
        OrderServiceImpl orderService = new OrderServiceImpl();
        when(firstProviderMock.process(createOrder())).thenReturn(true);
        when(secondProviderMock.process(createOrder())).thenReturn(true);
        when(thirdProviderMock.process(createOrder())).thenReturn(true);
        //When

        //Then
        Assertions.assertDoesNotThrow(() -> orderService.order(createOrder()));
    }

    @Test
    void testOrderFalse() throws OrderException {
        Provider firstProviderMock = mock(Provider.class);
        Provider secondProviderMock = mock(Provider.class);
        Provider thirdProviderMock = mock(Provider.class);
        OrderServiceImpl orderService = new OrderServiceImpl();
        when(firstProviderMock.process(createOrder())).thenReturn(true);
        when(secondProviderMock.process(createOrder())).thenReturn(true);
        when(thirdProviderMock.process(createOrder())).thenReturn(false);
        //When

        //Then
        Assertions.assertThrows(OrderException.class, () -> orderService.order(createOrder()));
    }
}
