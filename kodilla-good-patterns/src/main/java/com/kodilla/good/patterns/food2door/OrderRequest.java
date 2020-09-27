package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    public User user;
    public String provider;
    public java.lang.String productType;
    public double productQuantity;

    public OrderRequest(User user, String provider, java.lang.String productType, double productQuantity) {
        this.user = user;
        this.provider = provider;
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getProvider() {
        return provider;
    }

    public java.lang.String getProductType() {
        return productType;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}
