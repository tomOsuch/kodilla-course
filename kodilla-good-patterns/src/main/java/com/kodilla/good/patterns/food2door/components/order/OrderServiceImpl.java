package com.kodilla.good.patterns.food2door.components.order;

import com.kodilla.good.patterns.food2door.components.model.Product;
import com.kodilla.good.patterns.food2door.components.model.provider.Provider;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(Map<Product, Integer> products){

        filterByProvider(products);


        if (!products.entrySet().stream()
                .collect(Collectors.toList()).stream()
                .map(a -> a.getKey().getProvider().process(products))
                .allMatch(process -> process.equals(true))) throw new OrderException();

    }

    private List<Map<Product, Integer>> groupByProvider(Map<Product, Integer> productOrder) {

        return null;
    }

    private void filterByProvider(Map<Product, Integer> productList) {
        List<String> a = productList.keySet().stream()
                .map(Product::getProvider)
                .map(Provider::getProviderName)
                .collect(Collectors.toList());
        List<String> providers = removeDuplicationToList(a);


        Map<Product, Integer> prod = productList.entrySet().stream()
                .filter(integer -> integer.getKey().getProvider().getProviderName().equals(providers.get(0)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        prod.keySet().stream()
                .map(Product::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
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
}
