package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;
import com.kodilla.good.patterns.food2door.components.order.OrderException;
import com.kodilla.good.patterns.food2door.components.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OrderServiceTest {


    static Provider successProviderMock = mock(Provider.class);
    static Provider failedProviderMock = mock(Provider.class);
    OrderServiceImpl orderService = new OrderServiceImpl();

    @BeforeAll
    public static void initsMock() {
        when(successProviderMock.process(any())).thenReturn(true);
        when(failedProviderMock.process(any())).thenReturn(false);
    }

    private Map<Product, Integer> createOrder(Provider provider) {

        return Map.of(
                new Product("Chleb bez glutenowy", successProviderMock, new BigDecimal("5.99")), 2,
                new Product("Mleko sojowe", successProviderMock, new BigDecimal("4.99")), 1,
                new Product("Krewetki", provider, new BigDecimal("10.50")), 3

        );
    }

    @Test
    void testOrderTrue() throws OrderException {
        //Give
        Map<Product, Integer> mapOrder = createOrder(successProviderMock);
        //When

        //Then
        Assertions.assertDoesNotThrow(() -> orderService.order(mapOrder));
    }

    @Test
    void testOrderFalse() throws OrderException {
        //Given
        Map<Product, Integer> mapOrder = createOrder(failedProviderMock);
        //When

        //Then
        Assertions.assertThrows(OrderException.class, () -> orderService.order(mapOrder));
    }
}
