package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(Map<Product, Integer> products){

        boolean overallResult = groupByProvider(products).entrySet().stream()
                .map(providerProducts -> providerProducts.getKey().process(providerProducts.getValue()))
                //.reduce((r1, r2) -> r1 && r2)
                .allMatch(result -> result.equals(true));

        if (!overallResult) throw new OrderException();

    }


    private void filterByProvider(Map<Product, Integer> productList) {
       // List<Map<Product, Integer>> ordersToProviderList = new ArrayList<>();
        Set<String> providerDuplicateList = productList.keySet().stream()
                .map(Product::getProvider)
                .map(Provider::getProviderName)
                .collect(Collectors.toSet());
        //List<String> providers = removeDuplicationToList(providerDuplicateList);

        //Map<Product,Integer> map = creatMapIteration(productList, providers);



    }

    private void addProductToProvider(Map<Provider, Map<Product, Integer>> order, Product prod, int count) {
        Provider provider = prod.getProvider();
        if (order.containsKey(provider)) {
            order.get(provider).put(prod, count);
        } else {
            order.put(provider, new HashMap<>(Map.of(prod, count)));
        }
    }

    private Map<Provider, Map<Product, Integer>> groupByProvider(Map<Product, Integer> order) {
        Map<Provider, Map<Product, Integer>> orderGroupedByProvider = new HashMap<>();
        for (Map.Entry<Product, Integer> product : order.entrySet()) {
            addProductToProvider(orderGroupedByProvider, product.getKey(), product.getValue());
        }
        return orderGroupedByProvider;
    }

    private List<String> removeDuplicationToList(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (i != j && names.get(i).equals(names.get(j))) {
                    names.remove(j);
                }
            }
        }
        return names;
    }

    private Map<Product, Integer> creatMapIteration(Map<Product, Integer> prodMap, List<String> providers) {
        Map<Product, Integer> returnProductMap = null;
        for (int i = 0; i < providers.size(); i++) {
            int finalI = i;
            returnProductMap =  prodMap.entrySet().stream()
                    .filter(integer -> integer.getKey().getProvider().getProviderName().equals(providers.get(finalI)))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            prodMap.entrySet().stream()
                    .filter(integer -> integer.getKey().getProvider().getProviderName().equals(providers.get(finalI)))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).keySet().stream()
                    .map(Product::getName)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
            System.out.println("----------------");

        }
        return returnProductMap;
    }
}
