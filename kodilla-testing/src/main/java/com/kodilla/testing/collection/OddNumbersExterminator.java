package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> numbersEven = new ArrayList<>();
        if (numbers != null) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    numbersEven.add(number);
                }
            }
        } else {
            numbersEven = null;
        }
        return numbersEven;
    }
}
