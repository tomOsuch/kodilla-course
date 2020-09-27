package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    private Provider provider;

    public OrderRequest retriever() {
        User user = new User(1, "jkowalski", "1234", "jan.kowalski@test.pl", "Ul. Kwiatowa 12");
        java.lang.String stringString = provider.getProvider(1);
        java.lang.String productType = "";
        double productQuantity = 2;

        return new OrderRequest(user, stringString, productType, productQuantity);
    }
}
