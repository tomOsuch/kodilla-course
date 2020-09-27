package com.kodilla.good.patterns.challenges.shop.components.order;

import com.kodilla.good.patterns.challenges.shop.components.model.Product;
import com.kodilla.good.patterns.challenges.shop.components.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderRequest {

    private final User user;
    private final LocalDateTime orderDate;
    private final Product product;
    private static final List<Product> products;

    static {
      products = List.of(new Product("Komputer", new BigDecimal("182.5")),
              new Product("Ładowarka", new BigDecimal("15.99")));
    }

    public OrderRequest(User user, LocalDateTime orderDate, int index) {
        this.user = user;
        this.orderDate = orderDate;
        product = products.get(index);
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct() {
        return product;
    }
}
