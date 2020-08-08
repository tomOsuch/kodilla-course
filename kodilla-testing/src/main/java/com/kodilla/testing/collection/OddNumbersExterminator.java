package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> numbersOdd = new ArrayList<>();
        if (numbers != null) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    numbersOdd.add(number);
                }
            }
        } else {
            numbersOdd = null;
        }
        return numbersOdd;
    }
}
